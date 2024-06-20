class Solution {
    public List<String> subdomainVisits(String[] cpdomains) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<cpdomains.length;i++){
            String res[]=cpdomains[i].split(" ");
            if(map.containsKey(res[1])){
                map.put(res[1],map.get(res[1])+Integer.parseInt(res[0]));
            }
            else{
                map.put(res[1],Integer.parseInt(res[0]));
            }
            for(int j=0;j<res[1].length();j++){
                if(res[1].charAt(j)=='.'){
                    if(map.containsKey(res[1].substring(j+1))){
                map.put(res[1].substring(j+1),map.get(res[1].substring(j+1))+Integer.parseInt(res[0]));
            }
            else{
                map.put(res[1].substring(j+1),Integer.parseInt(res[0]));
            }
                    
                }

            }
        }
        List<String> at=new ArrayList<>();
        Set<String> sty=map.keySet();
        for(String it:sty){
            String adf=map.get(it)+" "+it;
            at.add(adf);
        }
        return at;
    }
}