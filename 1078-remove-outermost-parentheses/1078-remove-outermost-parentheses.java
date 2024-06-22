class Solution {
    public String removeOuterParentheses(String s) {
        String res="";
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)=='('){
                res=res+s.charAt(i);
                count++;

            }
            else if(s.charAt(i)==')'&& count>=1){
            res=res+s.charAt(i);
            count--;
            }
            else{
                i++;
            }
        }
        return res;
    }
}