class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        List<Integer> even =new ArrayList<>();
        List<Integer> odd=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                even.add(nums[i]);
            }
            else{
                odd.add(nums[i]);
        }
        }
        int ev=0;
        int o=0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                nums[i]=even.get(ev++);
            }
            else{
                nums[i]=odd.get(o++);
            }
        }
        return nums;
        
    }
}