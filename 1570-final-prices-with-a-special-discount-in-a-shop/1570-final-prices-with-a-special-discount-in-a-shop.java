class Solution {
    public int[] finalPrices(int[] prices) {
        int arr[]=new int[prices.length];
        int var=0;
        for(int i=0;i<prices.length;i++){
            boolean var1=true;
            for(int j=i+1;j<prices.length;j++){
                if(prices[j]<=prices[i]){
                    arr[var++]=(prices[i]-prices[j]);
                    var1=false;
                    break;
                }
                else{
                    continue;
                }
            }
            if(var1){
                arr[var++]=prices[i];
            }
        }
        return arr;
    }
}