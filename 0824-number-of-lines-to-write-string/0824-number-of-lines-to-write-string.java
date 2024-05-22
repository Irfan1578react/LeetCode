class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int ans[]=new int[2];
        ans[1]=0;
        ans[0]=1;
        for(int i=0;i<s.length();i++){
            char curr=s.charAt(i);
            if(ans[1]<=100 && ans[1]+widths[curr-97]<=100){
                ans[1]=ans[1]+widths[curr-97];
            }
            else{
                ans[1]=widths[curr-97];
                ans[0]=ans[0]+1;
            }
        }
        
        return ans;
        
    }
}