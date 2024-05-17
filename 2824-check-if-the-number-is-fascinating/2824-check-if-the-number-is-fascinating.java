class Solution {
    public boolean isFascinating(int n) {
        int tn=n*2;
        int thn=n*3;
        String res=""+n+tn+thn;
        String ans[]=res.split("");
        int res2[]=new int[ans.length];
        for(int j=0;j<res2.length;j++){
            res2[j]=Integer.parseInt(ans[j]);
        }
        Arrays.sort(res2);
        int var=0;
        
        if(res2.length==9){
        for(int i=1;i<=9;i++){
            if(res2[var++]==i){
                continue;
            }
            else{
                return false;
            }
        }
        }
        else{
            return false;
        }
        return true;
        
    }

}