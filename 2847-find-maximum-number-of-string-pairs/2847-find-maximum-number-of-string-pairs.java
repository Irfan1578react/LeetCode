class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for(int i=0;i<=words.length-2;i++){
            for(int j=i+1;j<words.length;j++){
                String uk="";
                for(int k=words[j].length()-1;k>=0;k--){
                    uk=uk+words[j].charAt(k);
                }
                if(words[i].equals(uk)){
                    count++;
                }
            }
        }
        return count;
    }
}