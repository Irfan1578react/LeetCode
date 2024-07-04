class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> arr=new ArrayList<>();
        for(int i=left;i<=right;i++){
            int temp=i;
            boolean var=true;
            while(temp!=0){
                int val=temp%10;
                if( val!=0  && i%(val)==0 ){
                    temp=temp/10;
                }
                else{
                    var=false;
                    break;

                }
                
            }
            if(var==true){
                arr.add(i);
            }
        }
        return arr;
        
    }
}