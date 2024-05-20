class Solution {
    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<=words.length-2;i++){
            for(int j=i+1;j<words.length;j++){
                if(words[i].length()>words[j].length()){
                    continue;
                }
                else{
                    String pre=words[j].substring(0,words[i].length());
                    String suf=words[j].substring(words[j].length()-words[i].length());
                    if(words[i].equals(pre) && words[i].equals(suf)){
                        count++;
                    }
                }
            }
        }
        return count;
        
    }
}