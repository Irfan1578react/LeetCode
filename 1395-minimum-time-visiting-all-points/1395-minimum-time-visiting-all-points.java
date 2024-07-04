class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int val=0;
        int count=0;
        for(int i=0;i<points.length-1;i++){
            int val1=points[i][0];
            int val2=points[i][1];
            int val3=points[i+1][0];
            int val4=points[i+1][1];
            int ans1=Math.abs(val1-val3);
            int ans2=Math.abs(val2-val4);
            count=count+Math.max(ans1,ans2);
        }
        return count;
        
    }
}