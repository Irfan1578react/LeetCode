class Solution {
    public int maximumProduct(int[] nums) {
        int max=Integer.MIN_VALUE;
        Arrays.sort(nums);
        int negcount=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                negcount++;
            }
        }
        if(negcount==0){
        max=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
        }
        else if(negcount==1){
        max=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];    
        }
        else{
            if(negcount==nums.length){
            max=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
            }
            else{
            int ans=nums[0]*nums[1]*nums[nums.length-1];
            int ans2=nums[0]*nums[nums.length-2]*nums[nums.length-1];
            int ans3=nums[nums.length-3]*nums[nums.length-2]*nums[nums.length-1];
            max=ans>ans2?ans:ans2;
            max=Math.max(max,ans3);
            }
        }
        // for(int i=0;i<=nums.length-3;i++){
        //     for(int j=i+1;j<=nums.length-2;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             int sum=nums[i]*nums[j]*nums[k];
        //             if(max<sum){
        //                 max=sum;
        //             }
        //         }
        //     }
        // }
        return max;
    }
}