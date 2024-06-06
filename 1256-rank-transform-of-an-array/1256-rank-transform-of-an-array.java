class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // creating clone using arr.clone() method
        int[]res;
        res=arr.clone();
        Arrays.sort(res);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<res.length;i++){
            if(!map.containsKey(res[i])){
                map.put(res[i],map.size()+1);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
        
    }
}