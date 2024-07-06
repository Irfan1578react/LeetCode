class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length-1;i++){
            for(int j=0;j<matrix[0].length-1;j++){
                if(diagonal(matrix,i,j)){
                    continue;
                }
                else{
                    return false;
                }
            }
           

        }
        return true;
        
    }
    public boolean diagonal(int matrix[][],int row,int col){
        int val=matrix[row][col];
        if(matrix[row+1][col+1]==val){
            return true;
        }
        return false;
    }
}