class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length && 2*i<nums.length && 2*i+1<nums.length;i++){
            int freq=nums[2*i];
            int val=nums[2*i+1];
            for(int j=0;j<freq;j++){
                arr.add(val);
            }
        }
        int res[]=new int[arr.size()];
        for(int i=0;i<res.length;i++){
            res[i]=arr.get(i);
        }
        return res;
        
    }
}