class Solution {
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> res=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            res.add(nums[i]);
            int rev=0;
            int temp=nums[i];
            while(temp!=0){
                rev=(rev*10)+temp%10;
                temp=temp/10;
            }
            res.add(rev);
        }
        return res.size();
        
    }
}