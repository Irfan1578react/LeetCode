class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        int mul=purchaseAmount/10;

        int min=Integer.MAX_VALUE;
        int val1=Math.abs((10*mul)-purchaseAmount);
        int val2=Math.abs((10*(mul+1))-purchaseAmount);
        if(val1<val2){
            return 100-(10*mul);
        }
        else if(val2<val1){
            return 100-(10*(mul+1));
        }
        else{
            return 100-(10*(mul+1));
        }
        
    }
}