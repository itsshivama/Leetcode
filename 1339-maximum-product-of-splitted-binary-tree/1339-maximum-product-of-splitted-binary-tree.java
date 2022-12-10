class Solution {

    int MOD = 1_000_000_007;
    long[] maxprodsofar = new long[1];

    public int maxProduct(TreeNode root) {
        if (root == null) {
            return 0;
        }

        maxprodsofar[0] = Long.MIN_VALUE;
        long sumTotalTree = getTotalSum(root);
        helper(root, sumTotalTree);
        return (int)(maxprodsofar[0] % MOD);
    }

    public long helper(TreeNode node, long globalsum) {
        //base case : leaf node worker
        if (node.left == null && node.right == null) {
            //pass
        }

        //recursive case : internal node worker
        long sumatnode = node.val;

        if (node.left != null) {
            sumatnode += helper(node.left, globalsum);
        }

        if (node.right != null) {
            sumatnode += helper(node.right, globalsum);
        }

        //System.out.println("Node " + node.val + ", Sum at this node : " + sumall);
        maxprodsofar[0] = Math.max(maxprodsofar[0], ((globalsum - sumatnode) * sumatnode));

        return sumatnode;
    }

    public long getTotalSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return root.val 
            + getTotalSum(root.left) 
            + getTotalSum(root.right);
    }
}