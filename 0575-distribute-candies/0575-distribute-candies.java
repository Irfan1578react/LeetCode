class Solution {
    public int distributeCandies(int[] candyType) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<candyType.length;i++){
            if(map.containsKey(candyType[i])){
                map.put(candyType[i],map.get(candyType[i]));
            }
            else{
                map.put(candyType[i],1);
            }
        }
        Set<Integer> st=map.keySet();
        int sum=0;
        for(Integer it:st){
            sum=sum+1;
        }
        if(sum<=(candyType.length)/2){
            return sum;
        }
        else{
            return (candyType.length)/2;
        }
        
        
    }
}