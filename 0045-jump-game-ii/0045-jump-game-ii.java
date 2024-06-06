class Solution {
    public int jump(int[] nums) {
        // this is a recursion approach that i tried but it was not time sufficient
        // int arr[]=new int[1];
        // arr[0]=Integer.MAX_VALUE;
        // helper(nums,arr,0,0);
        
        // return arr[0];
        //this approach is the greedy approach where we choose the farthest
        //and then until that farthest wheter we able to achieve it or not .
        int farthest=0;
        int current=0;
        int jump=0;
        if(nums.length==1){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            farthest=Math.max(farthest,i+nums[i]);
            if(i==current){
                jump++;
                current=farthest;
            }
            if(current>=nums.length-1){
                return jump;
            }
        }
        return jump;
        
    }
    // public  void helper(int nums[],int arr[],int index,int steps){
    //     if(index>=nums.length){
    //         return;
    //     }
    //     if(index==nums.length-1){
    //         arr[0]=Math.min(arr[0],steps);
    //     }
    //     int val=nums[index];
    //     for(int i=1;i<=val;i++){
    //         helper(nums,arr,index+i,steps+1);
    //     }
    // }
}