class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i=0;
        int j=matrix[0].length-1;
        int row=matrix.length;
        int col=matrix[0].length;
        while(i<row && j>=0){
            if(matrix[i][j]==target){
                return true;
            }
            if(target>matrix[i][j]){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
        
    }
}