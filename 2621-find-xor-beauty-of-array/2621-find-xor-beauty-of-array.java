class Solution {
    public int xorBeauty(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++){
            total=total^nums[i];
        }
        return total;
    }
}