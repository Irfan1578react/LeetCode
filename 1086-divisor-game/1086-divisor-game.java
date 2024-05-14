class Solution {
    public boolean divisorGame(int n) {
        int count=0;
        while(n>1){
            for(int i=1;i<n;i++){
                if(n%i==0){
                    n=n-i;
                    count++;
                    break;
                }
            }
        }
        if(n==1 && count%2!=0){
            return true;
        }
        return false;
        
    }
}