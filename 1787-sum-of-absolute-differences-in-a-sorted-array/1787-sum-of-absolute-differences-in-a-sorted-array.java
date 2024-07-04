class Solution {
    public int[] getSumAbsoluteDifferences(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        left[0]=0;
        int n=nums.length;
        int ans[]=new int[nums.length];
        right[nums.length-1]=0;
        for(int i=0;i<nums.length-1;i++){
            left[i+1]=left[i]+nums[i];
        }
        for(int i=nums.length-2;i>=0;i--){
            right[i]=right[i+1]+nums[i+1];
        }
        for(int i=0;i<nums.length;i++){
            ans[i]=Math.abs((right[i]-(nums[i]*(n-i-1)))-(left[i]-(nums[i]*i)));
        }
        return ans;
        
    }
}