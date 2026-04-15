/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode dummy = new ListNode(0, null);
        ListNode head = dummy;

        while(l1 != null || l2 != null){
            
            int num1 = (l1 != null) ? l1.val : 0;
            int num2 = (l2 != null) ? l2.val : 0;

            int sum = num1 + num2 + carry; 

            int num = sum % 10;
            carry = sum / 10;

            ListNode node = new ListNode(num, null);
            dummy.next = node;
            dummy = dummy.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(carry != 0){
            ListNode node = new ListNode(carry, null);
            dummy.next = node;
            dummy = dummy.next;
        }

        return head.next;

    }
}
