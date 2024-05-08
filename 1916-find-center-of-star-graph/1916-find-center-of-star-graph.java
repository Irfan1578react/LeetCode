class Solution {
    public int findCenter(int[][] edges) {
        int val=0;
        boolean res=true;
        for(int i=1;i<edges.length;i++){
            for(int j=0;j<edges[0].length;j++){
                if(edges[i][j]==edges[0][0]){
                    val=edges[0][0];
                    res=false;
                    break;
                }
                if(edges[i][j]==edges[0][1]){
                    val=edges[0][1];
                    res=false;
                    break;
                }
            }
            if(res==false){
                break;
            }
        }
        return val;
        
    }
}