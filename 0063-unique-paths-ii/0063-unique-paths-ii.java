class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int dp[][]=new int[obstacleGrid.length][obstacleGrid[0].length];
        for(int i=0;i<obstacleGrid.length;i++){
            for(int j=0;j<obstacleGrid[0].length;j++){
                dp[i][j]=-1;
            }
        }
         return helper(obstacleGrid,dp,0,0);
    }
    public int helper(int[][]obstacleGrid,int[][]dp,int d,int r){
        if(d==obstacleGrid.length-1 && r==obstacleGrid[0].length-1 && obstacleGrid[d][r]!=1){
            return 1;
        }
        if(obstacleGrid[d][r]==1){
            return 0;
        }
        int down=0;
        int right=0;
        if(d<obstacleGrid.length-1){
            if(dp[d][r]!=-1){
                return dp[d][r];
            }
             down=helper(obstacleGrid,dp,d+1,r);
        }
        if(r<obstacleGrid[0].length-1){
            if(dp[d][r]!=-1){
                return dp[d][r];
            }
             right=helper(obstacleGrid,dp,d,r+1);
        }
        int ans=down+right;
        dp[d][r]=ans;
        return dp[d][r];
    }
}