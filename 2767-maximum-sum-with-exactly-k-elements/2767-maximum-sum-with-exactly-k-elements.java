class Solution {
    public int maximizeSum(int[] nums, int k) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        int sum=0;
        for(int i=0;i<k;i++){
            sum=sum+max;
            max++;

        }
        return sum;
        
    }
}