class Solution {
    public int dominantIndex(int[] nums) {
        int max=Integer.MIN_VALUE;
        int index=-1;
        for(int i=0;i<nums.length;i++){
            if(max<nums[i]){
                max=nums[i];
                index=i;
            }
        }
        for(int i=0;i<nums.length;i++){
            if( nums[i]!=max  && (nums[i]*2)<=max){
                continue;
            }
            else{
                if(nums[i]==max){
                    continue;
                }
                return -1;
            }
        }
        return index;
        
    }
}