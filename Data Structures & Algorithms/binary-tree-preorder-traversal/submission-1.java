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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode curr = root;

        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                result.add(curr.val);
                stack.push(curr);

                curr = curr.left;
            }

            curr = stack.pop();
            curr = curr.right;
        }
        
        // helper(root, tree);
        return result;
    }

    // public void helper(TreeNode root, List<Integer> tree){
    //     if(root == null) return;
    //     tree.add(root.val);
    //     helper(root.left, tree);
    //     helper(root.right, tree);
    // }
}