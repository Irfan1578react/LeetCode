class Solution {
    public String predictPartyVictory(String senate) {
        List<Character> q=new LinkedList<>();
        for(int i=0;i<senate.length();i++){
            
                q.add(senate.charAt(i));
            
        }
        while(!q.isEmpty()){
            char curr=q.remove(0);
            if(q.isEmpty()){
                if(curr=='D'){
                return "Dire";
                }
                else{
                    return "Radiant";
                }

            }
            if(curr==q.get(0)){
                 q.add(curr);
                 
                 if(curr=='D'){
                    int val=q.indexOf('R');
                    if(val==-1){
                        return "Dire";
                    }
                    q.remove(val);
                 }
                 else{
                    int val=q.indexOf('D');
                    if(val==-1){
                        return "Radiant";
                    }
                    q.remove(val);
                 }
                 if(q.contains('D')){
                    if(q.contains('R')){
                        continue;
                    }
                    else{
                        return "Dire";
                    }
                 }
                 else{
                    return "Radiant";
                 }
            }
            else if(curr!=q.get(0)){
                q.add(curr);
                q.remove(0);

            }
        }
        return "";

    }
}