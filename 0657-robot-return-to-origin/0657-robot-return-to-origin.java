class Solution {
    public boolean judgeCircle(String moves) {
        int r=0;
        int c=0;
        for(int  i=0;i<moves.length();i++){
            if(moves.charAt(i)=='U'){
                r=r-1;
            }
            if(moves.charAt(i)=='R'){
                c=c+1;
            }
            if(moves.charAt(i)=='L'){
                c=c-1;
            }if(moves.charAt(i)=='D'){
                r=r+1;
            }            
        }
        if(c==0 && r==0){
            return true;
        }
        return false;
        
    }
}