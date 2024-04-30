class Solution {
    public int findMiddleIndex(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            if(sum(nums,i)){
                return i;
            }
        }
        return -1;
    }
    public boolean sum(int[] nums,int index ){
        int sum=0;
        int sum2=0;
        for(int i=0;i<index;i++){
            sum=sum+nums[i];
        }
        for(int i=index+1;i<nums.length;i++){
            sum2=sum2+nums[i];
        }
        if(sum==sum2){
            return true;
        }
        return false;

    }
}