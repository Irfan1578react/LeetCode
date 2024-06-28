class Solution {
    public int[] sortByBits(int[] arr) {
    HashMap<Integer,List<Integer>> map=new HashMap<>();
    Arrays.sort(arr);
    for(int i=0;i<arr.length;i++){
        for(int j=0;j<arr.length-1-i;j++){
            if(Integer.bitCount(arr[j])>Integer.bitCount(arr[j+1])){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    return arr;
    // for(int i=0;i<arr.length;i++){
    //     int count=0;
    //     int var=0;
    //     while((arr[i]&(1<<var))>0){
    //         if((arr[i]&(1<<var))>=1){
    //         count++;
    //         }
    //         var++;
    //     }
    //     if(map.containsKey(count)){
    //         map.get(count).add(arr[i]);
    //     }
    //     else{
    //         List<Integer> rt=new ArrayList<>();
    //         rt.add(arr[i]);
    //         map.put(count,rt);
    //     }

    // }
    // List<Integer> arr1=new ArrayList<>();
    // Set<Integer> st=map.keySet();

    // for(Integer it:st){
    //     arr1.addAll(map.get(it));
    // }
    // int ans[]=new int[arr1.size()];
    // for(int i=0;i<ans.length;i++){
    //     ans[i]=arr1.get(i);
    // }
    // return ans;
        
    }
}