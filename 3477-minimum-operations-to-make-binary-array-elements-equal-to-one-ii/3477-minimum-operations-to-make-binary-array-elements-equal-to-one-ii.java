class Solution {
    public int minOperations(int[] nums) {
       
       int val=0;
       int count=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]==val){
            count++;
            val=1-val;
        }
       }
       return count;
    }
}