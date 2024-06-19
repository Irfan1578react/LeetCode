class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int i=piles.length-2;
        int j=0;
        int sum=0;
        while(j<i){
            sum=sum+piles[i];
            i=i-2;
            j++;

        }
        return sum;
        
    }
}