class Solution {
    public int countSegments(String s) {
        String res[]=s.split(" ");
        int count=0;
        for(int i=0;i<res.length;i++){
            if(res[i].isEmpty()){
                continue;
            }
            else{
                count++;
            }

        }
        return count;
        
    }
}