class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        int l=1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }

        }
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)=='L'&&s.charAt(i+1)=='L'){
                l++;
            }
            else{
                if(l>=3){
                return false;
                }
                l=1;
            }
        }
        if(l>=3){
            return false;
        }
        if(a<2){
            return true;
        }
        return false;
    }
}