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
    private long maxProduct = 0;
    private int totalSum = 0; 
    
    public int maxProduct(TreeNode root) {
        totalSum = getTotalSum(root);
        getProduct(root);

        return (int) (maxProduct % 1000000007);
    }

    private int getTotalSum(TreeNode node) {
        if (node == null) {
            return 0;
        }

        int leftSum = getTotalSum(node.left);
        int rightSum = getTotalSum(node.right);
        
        return leftSum + node.val + rightSum;
    }

    private int getProduct(TreeNode node) {
        
        if (node == null) {
            return 0;
        }

        int leftSum = getProduct(node.left);
        int rightSum = getProduct(node.right);
        int currentSum = leftSum + node.val + rightSum;
        long currentProduct = (long) currentSum * (totalSum - currentSum);
        
        if (currentProduct > maxProduct) {
            maxProduct = currentProduct;
        }
        
        return currentSum;
    }
}