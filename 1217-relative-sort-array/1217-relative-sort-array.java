class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<arr2.length;i++){
            int count=1;
            for(int j=0;j<arr1.length;j++){
                if(arr2[i]==arr1[j]){
                    arr1[j]=-1;
                    arr.add(arr2[i]);
                }
            }

        }
        Arrays.sort(arr1);
        for(int i=0;i<arr1.length;i++){
            if(!(arr1[i]==-1)){
                arr.add(arr1[i]);
            }
        }
        int res[]=new int[arr.size()];
        for(int i=0;i<res.length;i++){
            res[i]=arr.get(i);
        }
        return res;
        
    }
}