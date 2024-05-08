class Solution {
    public int findFinalValue(int[] nums, int original) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            arr.add(nums[i]);
        }
        while(arr.contains(original)){
            original=original*2;
        }
        return original;
        
    }
}