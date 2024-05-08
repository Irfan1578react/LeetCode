class Solution {
    public int[] twoSum(int[] numbers, int target) {
        List<Integer> arr=new ArrayList<>();
        int i=0;
        int j=(numbers.length)-1;
        while(i<j){
            if((numbers[i]+numbers[j])==target){
                arr.add(i+1);
                arr.add(j+1);
                break;
            }
            else if((numbers[i]+numbers[j])>target){
                j--;
            }
            else{
                i++;
            }
        }
        int arr1[]=new int[arr.size()];
        for(int k=0;k<arr.size();k++){
            arr1[k]=arr.get(k);
        }
        return arr1;
        
    }
}