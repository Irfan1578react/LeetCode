class Solution {
    public int minimizedStringLength(String s) {
        HashMap<Character,Integer> arr=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(arr.containsKey(s.charAt(i))){
                arr.put(s.charAt(i),arr.get(s.charAt(i))+1);
            }
            else{
                arr.put(s.charAt(i),1);
            }
        }
        Set<Character> se=arr.keySet();
        return se.size();
        
    }
}