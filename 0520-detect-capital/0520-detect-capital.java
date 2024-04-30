class Solution {
    public boolean detectCapitalUse(String word) {
        if(islower(word)|| isupper(word) || isstart(word)){
            return true;
        }
        else{
            return false;
        }
        
    }
    public boolean islower(String word){
        for(int i=0;i<word.length();i++){
            if(Character.isLowerCase(word.charAt(i))==true){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isupper(String word){
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))==true){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public boolean isstart(String word){
        for(int i=0;i<word.length();i++){
            if(i==0){

            
            if(Character.isUpperCase(word.charAt(i))==true){
                continue;
            }
            else{
                return false;
            }
            }
            else{
                if(Character.isLowerCase(word.charAt(i))==true){
                continue;
            }
            else{
                return false;
            }

            }
        }
        return true;
    }
}