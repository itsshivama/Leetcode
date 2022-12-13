class Solution {
    private int f(int row,int col,int n,int m,int matrix[][],int dp[][]){
       if(row==n-1&& col>=0&&col<=m-1)  return matrix[row][col];
        if(row>=n || col<0 || col>=m)  return 100000;
        if(dp[row][col]!=0) return dp[row][col];
        int one =0,two=0,three=0;
        
            one=f(row+1,col-1,n,m,matrix,dp);
            two=f(row+1,col,n,m,matrix,dp);
            three=f(row+1,col+1,n,m,matrix,dp);
        
        return dp[row][col]=matrix[row][col]+Math.min(Math.min(one,two),three);
    }
    
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int m=matrix[0].length;
        int minSum=Integer.MAX_VALUE;
        int dp[][]=new int[n][m];
        for(int j=0;j<m;j++){
            minSum=Math.min(minSum,f(0,j,n,m,matrix,dp));
        }
        return minSum;
    }
}