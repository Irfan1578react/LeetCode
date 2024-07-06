class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(islucky(matrix,i,j,matrix[i][j])){
                    arr.add(matrix[i][j]);
                }
            }
        }
        return arr;
    }
    public boolean islucky(int [][]matrix,int row,int col,int val){
        for(int i=0;i<matrix.length;i++){
            if(val <matrix[i][col]){
                return false;
            }
        }
        for(int i=0;i<matrix[0].length;i++){
            if(val> matrix[row][i]){
                return false;
            }
        }
        return true;
    }
}