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
    // public TreeNode invertTree(TreeNode root) {
    //     if (root == null) return null;

    //     TreeNode temp = root.left;
    //     root.left = root.right;
    //     root.right = temp;

    //     invertTree(root.left);
    //     invertTree(root.right);

    //     return root;
    // }

    public TreeNode invertTree(TreeNode root){
        if (root == null) return root;

        TreeNode curr = root;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(curr);

        while(!stack.isEmpty()){

            // Pop top
            curr = stack.pop();
            
            // Swap right and left nodes
            TreeNode temp = curr.left; 
            curr.left = curr.right;
            curr.right = temp;
            
            // Push only if not null
            if(curr.left != null) stack.push(curr.left);
            if(curr.right != null) stack.push(curr.right);
        }

        return root;
    }
}
