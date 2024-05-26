class Solution {
    public int findPermutationDifference(String s, String t) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            
                map.put(s.charAt(i),i);
            
        }
        for(int i=0;i<t.length();i++){
            if(map.containsKey(t.charAt(i))){
            
                map.put(t.charAt(i),Math.abs(map.get(t.charAt(i))-i));
            }
        }
        Set<Character> st=map.keySet();
        int sum=0;
        for(Character it:st){
            sum=sum+map.get(it);
        }
        return sum;
        
        
        
    }
}