class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            boolean var=true;
            for(int j=0;j<words[i].length();j++){
                if(allowed.contains(words[i].charAt(j)+"")){
                    continue;
                }
                else{
                    var=false;
                    break;
                }
            }
            if(var==true){
                count++;
            }
        }
        return count;
        
    }
}