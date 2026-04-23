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
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;

        int res = 0;
        Deque<TreeNode> treeStack = new ArrayDeque<>(); // [node]
        Deque<Integer> depthStack = new ArrayDeque<>(); // [depth]
        treeStack.push(root);
        depthStack.push(1);

        while(!treeStack.isEmpty()){
            TreeNode curr = treeStack.pop();
            int depth = depthStack.pop();
            res = Math.max(res, depth);

            if(curr.left != null){
                treeStack.push(curr.left);
                depthStack.push(depth + 1);                
            }

            if(curr.right != null){
                treeStack.push(curr.right);
                depthStack.push(depth + 1);
            }
        }

        return res;
    }


    // public int maxDepth(TreeNode root) {
    //     if (root == null) return 0;
    //     int left = 0; int right = 0; 
        
    //     left = 1 + maxDepth(root.left);
    //     right = 1 + maxDepth(root.right);

    //     return Math.max(left, right);
    // }
}
