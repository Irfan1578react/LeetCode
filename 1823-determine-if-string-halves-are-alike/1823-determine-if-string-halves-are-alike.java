class Solution {
    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        s=s.toLowerCase();
        int count1=0;
        int count2=0;
        int i=0;
    
        while(i<mid){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||
            s.charAt(i)=='o'||s.charAt(i)=='u'){
                count1++;
            }
            i++;
        }
        while(mid<s.length()){
            if(s.charAt(mid)=='a'||s.charAt(mid)=='e'||s.charAt(mid)=='i'||
            s.charAt(mid)=='o'||s.charAt(mid)=='u'){
                count2++;
            }
            mid++;

        }
        if(count1==count2){
            return true;
        }
        else{
            return false;
        }
        
    }
}