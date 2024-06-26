class Solution {
    public int largestCombination(int[] arr) {
        int bin[]=new int[32];
    
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<32;j++){
                int temp=arr[i]&(1<<j);
                if(temp!=0){
                    bin[j]++;
                }
            }
        }
        int max=0;
        for(int i=0;i<bin.length;i++){
            if(max<bin[i]){
                max=bin[i];
            }
        }
        return max;
        
    }
}