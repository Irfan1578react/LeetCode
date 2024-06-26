class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int total=0;
        for(int i=0;i<arr2.length;i++){
            total=total^arr2[i];
        }
        int total2=0;
        for(int i=0;i<arr1.length;i++){
            total2=total2^arr1[i];
        }
        // if(arr1.length%2==0){
        //     total=0;
        // }
        // if(arr2.length%2==0){
        //     total2=0;
        // }
        return total2&total;
        
    }
}