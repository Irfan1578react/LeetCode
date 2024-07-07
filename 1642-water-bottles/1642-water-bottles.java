class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int count=numBottles;
        int emptybottle=numBottles;
        while(emptybottle>=numExchange){
            int newBottle=emptybottle/numExchange;
           count=count+newBottle;
           emptybottle=newBottle+(numBottles%numExchange);
           numBottles=emptybottle;
            

        }
        return count;
        
    }
}