class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        for(int i=0;i<strs.length;i++){
        char charArray[]=strs[i].toCharArray();
        Arrays.sort(charArray);
        String s=new String(charArray);
        if(map.containsKey(s)){
        map.get(s).add(strs[i]);
        }
        else{
            List<String> res2=new ArrayList<>();
            res2.add(strs[i]);
            map.put(s,res2);
        }
        

        
        }
        return new ArrayList<>(map.values());
        
    }
}