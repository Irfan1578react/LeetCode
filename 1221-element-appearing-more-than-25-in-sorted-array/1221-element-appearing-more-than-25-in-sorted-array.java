class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }
        int ele=0;
        Set<Integer> set=map.keySet();
        for(Integer se:set){
            if(max<map.get(se)){
                max=map.get(se);
                ele=se;
            }
        }
        return ele;
        
    }
}