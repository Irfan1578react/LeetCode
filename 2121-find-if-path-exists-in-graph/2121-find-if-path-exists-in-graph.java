class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
                adj.get(edges[i][0]).add(edges[i][1]);
                adj.get(edges[i][1]).add(edges[i][0]);
            }
            boolean vis[]=new boolean[n];
        bfs(adj,vis,source);
        
        return vis[destination];
    }
    public void bfs(List<List<Integer>> adj,boolean[] vis,int sv){
        Queue<Integer> qt=new LinkedList<>();
        qt.add(sv);
        vis[sv]=true;
        while(!qt.isEmpty()){
            int x=qt.peek();
            qt.poll();
            for(Integer it:adj.get(x)){
                if(!vis[it]){
                    vis[it]=true;
                    qt.add(it);
                }

            }
        }
    }
}