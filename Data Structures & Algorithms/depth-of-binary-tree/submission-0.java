/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    // public int maxDepth(TreeNode root) {
    //     if (root != null) return 0;

    //     int left = 0; int right = 0; int max = 0;
    //     Deque<TreeNode> stack = new ArrayDeque<>();
    //     TreeNode curr = root;

    //     while(curr != null || !stack.isEmpty()){
    //         while(curr != null){
    //             stack.push(curr);
    //             curr = curr.left;
    //         }

    //         curr = stack.pop();
    //         max += 1;
    //     }
    // }


    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int left = 0; int right = 0; 
        
        left = 1 + maxDepth(root.left);
        right = 1 + maxDepth(root.right);

        return Math.max(left, right);
    }
}
