class Solution {
    public int minimumPushes(String word) {
        int sum=0;
        int count=1;
        for(int i=0;i<word.length();i++){
            if(count<=8){
                sum=sum+1;
            }
            else if(count>8 && count<=16){
                sum=sum+2;
            }
            else if(count>16 && count<=24){
                sum=sum+3;
            }
            else{
                sum=sum+4;
            }
            count++;
        }
        return sum;
        
    }
}