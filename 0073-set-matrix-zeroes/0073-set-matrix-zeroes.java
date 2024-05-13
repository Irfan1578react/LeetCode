class Solution {
    public void setZeroes(int[][] matrix) {
        ArrayList<String> res=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    res.add(i+" "+j+" ");

                }
            }
        }
        for(int i=0;i<res.size();i++){
            setzero(matrix,res.get(i));
        }
    
        
    }
    public void setzero(int [][]matrix,String ans){
        String[] re=ans.split(" ");
        int row=Integer.parseInt(re[0]);
        int col=Integer.parseInt(re[1]);
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i]=0;
        }
        for(int j=0;j<matrix.length;j++){
            matrix[j][col]=0;
        }
    }
}