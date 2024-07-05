class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length-2;i++){
           int j=i+1;
           int temp=arr[i];
           while(j<arr.length){
                
                temp=temp+arr[j];
                if( i%2==0 && j%2==0){
                    sum=sum+temp;
                }
                if(i%2!=0 && j%2!=0){
                    sum=sum+temp;
                }
                j++;

           }
        }
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        return sum;
        
    }
}