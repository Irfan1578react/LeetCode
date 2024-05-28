class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        List<Character> res=new ArrayList<>();
        int max=releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
            if(max<(releaseTimes[i]-releaseTimes[i-1])){
                max=releaseTimes[i]-releaseTimes[i-1];
            }
        }
        if(releaseTimes[0]==max){
            res.add(keysPressed.charAt(0));
        }
        for(int i=1;i<releaseTimes.length;i++){
            if((releaseTimes[i]-releaseTimes[i-1])==max){
                res.add(keysPressed.charAt(i));
            }
        }
        Collections.sort(res);
        return res.get(res.size()-1);
        
    }
}