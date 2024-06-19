class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum=0;
        int answer[]=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

        }
        int left=0;
            int right=0;
        for(int i=0;i<nums.length;i++){
            
            if(i>0 && i<nums.length-1){
                left=left+nums[i-1];
                right=sum-left-nums[i];
                answer[i]=Math.abs(left-right);
            }
            else if(i==0){
                left=0;
                right=sum-nums[i];
            
                answer[i]=Math.abs(left-right);

            }
            else if(i==nums.length-1){
                right=0;
                left=left+nums[i-1];
                answer[i]=Math.abs(left-right);

            }

        }
        return answer;
        
    }
}