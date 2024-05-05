class Solution {
    public boolean hasAlternatingBits(int n) {
        String res=Integer.toBinaryString(n);
        for(int i=0;i<res.length()-1;i++){
            if(res.charAt(i)==(res.charAt(i+1))){
                return false;
            }
            else{
                continue;
            }
        }
        return true;
        
    }
}