class Solution {
    public int findJudge(int n, int[][] trust) {
        int adj[][]=new int[n+1][n+1];
        for(int i=0;i<trust.length;i++){
            for(int j=0;j<trust[0].length;j++ ){
                adj[trust[i][0]][trust[i][1]]=1;
            }
        }
        int []inplace=new int[n+1];
        int []outplace=new int[n+1];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(adj[i][j]==1){
                    inplace[j]++;
                    outplace[i]++;
                }
            }
        }
        for(int i=1;i<=n;i++){
            if(inplace[i]==n-1 && outplace[i]==0){
                return i;
            }
        }
        return -1;
        
    }
}