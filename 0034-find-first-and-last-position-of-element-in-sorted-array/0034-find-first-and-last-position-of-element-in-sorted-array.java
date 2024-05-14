class Solution {
    public int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int res[]=new int[2];
        boolean var1=true;
        boolean var2=true;
        if(i==j && nums[i]==target && nums[j] ==target){
            res[0]=i;
            res[1]=i;
            return res;
        }
        int count=0;
        int val=0;
        while(i<j){
            if(nums[i]==target && var1==true){
                res[0]=i;
                var1=false;
                val=i;
                count++;

            }
             if(nums[j]==target && var2==true){
                res[1]=j;
                var2=false;
                val=j;
                count++;
            }
           if(var1==true && var2==true || var1==false && var2==false){
            i++;
            j--;
           }
           else if(var1==false){
            j--;
           }
           else{
            i++;
           }
        }
        if(i==j && nums[i]==target && nums[j] ==target && count==0){
            res[0]=i;
            res[1]=i;
            return res;
        }
        if(count==1){
            res[0]=val;
            res[1]=val;
            return res;
        }
        if(var1==true && var2==true){
            res[0]=-1;
            res[1]=-1;
        }
        return res;
        
    }
}