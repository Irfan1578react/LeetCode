class Solution {
    public int arrangeCoins(int n) {
        int complete=0;
        long sum=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            if(sum>n){
                break;
            }
            else{
                complete++;
            }
        }
        return complete;
        
    }
}