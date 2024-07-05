class Solution {
    public int minimumPushes(String word) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<word.length();i++){
            if(map.containsKey(word.charAt(i))){
                map.put(word.charAt(i),map.get(word.charAt(i))+1);
            }
            else{
                map.put(word.charAt(i),1);
            }
        }
        List<Integer> at=new ArrayList<>();
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            at.add(entry.getValue());
        }
        Collections.sort(at);
        int count=0;
        int val=1;
        for(int k=at.size()-1;k>=0;k--){
            if(val<=8){
            count=count+(at.get(k)*1);
            }
            else if(val>8 && val<=16){
                count=count+(at.get(k)*2);
            }
            else if(val>16 && val<=24){
                count=count+(at.get(k)*3);
            }
            else{
                count=count+(at.get(k)*4);
            }
            val++;
        }
        return count;
        
    }
}