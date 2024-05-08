class Solution {
    public int[][] transpose(int[][] matrix) {
        int [][]res=new int[matrix[0].length][matrix.length];
        int row=0;
        int col=0;
        for(int i=0;i<res.length;i++){
            row=0;
            for(int j=0;j<res[0].length;j++){
                res[i][j]=matrix[row][col];
                row++;
            }
            col++;
        }
        return res;

        
    }
}