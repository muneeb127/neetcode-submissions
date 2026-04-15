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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int length = 0;

        ListNode current = head;

        while(current != null){
            length++;
            current = current.next;
        }

        int rem = length - n;
        int i = 1;
        current = head;
        System.out.println("length: " + length);

        if(rem <= 0) return head.next;

        while(current != null){
            if(rem == i){
                System.out.println("Current: " + current.val);
                current.next = current.next.next;
                break;
            }

            current = current.next;
            i++;
        }

        return head;
    }
}
