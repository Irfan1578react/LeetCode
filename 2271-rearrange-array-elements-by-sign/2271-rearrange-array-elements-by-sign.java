class Solution {
    public int[] rearrangeArray(int[] nums) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=0){
                arr.add(nums[i]);
            }
        }
        List<Integer> arrneg=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                arrneg.add(nums[i]);
            }
        }
        List<Integer> res=new ArrayList<>();
        int k=0;
        int l=0;
        while(k<arr.size() && l<arrneg.size()){
            res.add(arr.get(k));
            res.add(arrneg.get(l));
            k++;
            l++;
        }
        while(k<arr.size()){
            res.add(arr.get(k));
            k++;
        }
        while(l<arrneg.size()){
            res.add(arr.get(l));
            l++;
        }
        int res2[]=new int[res.size()];
        for(int i=0;i<res.size();i++){
            res2[i]=res.get(i);
        }
        return res2;


        
    }
}