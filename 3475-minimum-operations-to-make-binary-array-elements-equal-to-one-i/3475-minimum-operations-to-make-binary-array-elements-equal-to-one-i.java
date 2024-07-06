class Solution {
    public int minOperations(int[] nums) {
        int one=0;
        int two=1;
        int three=2;
        int count=0;
        for(int i=0;i<=nums.length-3;i++){
            if(nums[i]==0){
                
                    nums[one]=nums[one]^1;
                    nums[two]=nums[two]^1;
                    nums[three]=nums[three]^1;
                count+=1;
                one++;
                two++;
                three++;
                
                
            }
            else{
                one++;
                two++;
                three++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                continue;
            }
            else{
                return -1;
            }
        }

        return count;
        
    }
}