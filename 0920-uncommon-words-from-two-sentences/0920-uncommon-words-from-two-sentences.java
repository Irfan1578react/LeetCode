class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map=new HashMap<>();
        String res[]=s1.split(" ");
        String res1[]=s2.split(" ");
        for(int i=0;i<res.length;i++){
            if(map.containsKey(res[i])){
                map.put(res[i],map.get(res[i])+1);
            }
            else{
                map.put(res[i],1);
            }
        }
        for(int i=0;i<res1.length;i++){
            if(map.containsKey(res1[i])){
                map.put(res1[i],map.get(res1[i])+1);
            }
            else{
                map.put(res1[i],1);
            }
        }
        List<String> ans=new ArrayList<>();
        Set<String> st=map.keySet();
        for(String it:st){
            if(map.get(it)==1){
                ans.add(it);
            }
        }
        String ans2[]=new String[ans.size()];
        for(int j=0;j<ans.size();j++){
            ans2[j]=ans.get(j);
        }
        return ans2;
    }
}