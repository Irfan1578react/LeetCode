class Solution {
    public boolean divideArray(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        int j=1;
        while(i<nums.length && j<nums.length){
            if(nums[i]==nums[j]){
                i=i+2;
                j=j+2;
                continue;
            }
            else{
                return false;
            }
        }
        return true;

    
        
    }
}