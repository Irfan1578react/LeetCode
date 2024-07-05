class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==1 && isvalid(mat,i,j)){
                    count++;
                }
            }
        }
        return count;
        
    }
    public boolean isvalid(int matrix[][],int row,int col){
        for(int i=0;i<matrix.length;i++){
            if( i!=row &&matrix[i][col]!=0 ){
                return false;
            }
        }
         for(int i=0;i<matrix[0].length;i++){
            if( i!=col &&matrix[row][i]!=0 ){
                return false;
            }
        }
        return true;
    }
}