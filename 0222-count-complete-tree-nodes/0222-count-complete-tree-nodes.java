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
    public int countNodes(TreeNode root) {
        
        if(root == null) return 0;
        
        TreeNode left = root.left, right = root.right;
        int l=1, r=1;
        
        while(left!=null){left=left.left; l++;}
        while(right!=null){right=right.right; r++;}
        
        if(l==r) return (1 << l) - 1;
        
        return countNodes(root.left) + countNodes(root.right) + 1;
        
        
    }
}