class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0;
        int val=0;
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][i];
            mat[i][i]=0;
        }
        for(int i=0;i<mat.length;i++){
            sum=sum+mat[i][mat.length-i-1];
        }
        return sum;
        
    }
}