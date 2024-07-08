class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char res[]=s.toCharArray();
        while(i<j){
            if(isVowel(res[i]) && isVowel(res[j])){
                char temp=res[i];
                res[i]=res[j];
                res[j]=temp;
                i++;
                j--;
                
            }
            else if(!isVowel(res[i]) && !isVowel(res[j])){
                i++;
                j--;
            }
            else if(!isVowel(res[j])){
                j--;
            }
            else if(!isVowel(res[i])){
                i++;

            } 
        }
        String ans="";
        for(int h=0;h<res.length;h++){
            ans=ans+res[h];
        }
        return ans;
    }
    public boolean isVowel(char t){
        return "aeiouAEIOU".indexOf(t)!=-1;
    }
}