class Solution {
    public int countCompleteComponents(int n, int[][] edges) {
        List<List<Integer>> adj=new ArrayList<>(n);
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }
        boolean visited[]=new boolean[n];
        int count=0;
        
        for(int i=0;i<n;i++){
            if(!visited[i]){
                List<Integer> Component=new ArrayList<>();
                bfs(adj,visited,i,Component);
                if(isComplete(adj,Component)){
                    count++;
                }             
            
            }
        }
        return count;
        
    }
    public void bfs(List<List<Integer>> adj,boolean []visited,int sv,List<Integer> Component){
        Queue<Integer> qt=new LinkedList<>();
        qt.add(sv);
        visited[sv]=true;
        Component.add(sv);
        while(!qt.isEmpty()){
            int x=qt.poll();
            for(Integer it:adj.get(x)){
                if(!visited[it]){
                    qt.add(it);
                    Component.add(it);
                    visited[it]=true;
                }
            }
        }
    }
    public boolean isComplete(List<List<Integer>> adj,List<Integer> Component){
        for(int i=0;i<Component.size();i++){
            for(int j=i+1;j<Component.size();j++){
                if(!adj.get(Component.get(i)).contains(Component.get(j))){
                    return false;
                }
            }

        }
        return true;
    }

}