class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long count=0;
        long sum=0;
        for(int i=happiness.length-1;i>=happiness.length-k;i--){
            sum=sum+Math.max(happiness[i]-count,0);
            count++;
            
        }
        return sum;
        
    }
}