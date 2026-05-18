/**
 * Definition for a binary tree node.
 * class TreeNode {
 *     constructor(val = 0, left = null, right = null) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    /**
     * @param {TreeNode} root
     * @return {number[]}
     */
    preorderTraversal(root) {
        let res = [];
        let stack = [];
        let curr = root;

        while(curr != null || stack.length > 0){

            while(curr != null){
                res.push(curr.val);
                stack.push(curr);

                curr = curr.left;
            }

            curr = stack.pop();
            curr = curr.right;
        }

        return res;
    }

    traverse(root, res){
        if(root === null) return;
        
        res.push(root.val);

        this.traverse(root.left, res);
        this.traverse(root.right, res);
    }
}
