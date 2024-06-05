class Solution {
    public String longestPalindrome(String s) {
        String lps="";
        for(int i=1;i<s.length();i++){
            int left=i;
            int right=i;
            while(s.charAt(left)==s.charAt(right)){
                left--;
                right++;
                if(left<0 || right>=s.length()){
                    break;
                }
            }
            String palindrome=s.substring(left+1,right);
            if(palindrome.length()>lps.length()){
                lps=palindrome;
            }
             left=i-1;
            right=i;
            while(s.charAt(left)==s.charAt(right) ){
                left--;
                right++;
                if(left<0 || right>=s.length()){
                    break;
                }
            }
            palindrome=s.substring(left+1,right);
            if(palindrome.length() > lps.length()){
                lps=palindrome;
            }

        }
        if(s.length()==0){
            return "";
        }
        else if(s.length()==1){
            return s;
        }
        else{
            return lps;
        }
}
}
