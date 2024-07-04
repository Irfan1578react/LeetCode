class Solution {
    public String makeSmallestPalindrome(String s) {
        int count=0;
        int i=0;
        int j=s.length()-1;
        String res2[]=s.split("");
        String res="";
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(s.charAt(i)<s.charAt(j)){
                    res2[j]=res2[i];
                }
                else{
                    res2[i]=res2[j];
                }

            }
            i++;
            j--;
        }
        for(int h=0;h<res2.length;h++){
            res=res+res2[h];
        }
        return res;
        
        
    }
}