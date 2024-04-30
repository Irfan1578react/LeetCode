class Solution {
    public String capitalizeTitle(String title) {
        String s[]=title.split(" ");
        String s2="";
        for(int i=0;i<s.length;i++){
            String res=capitalize(s[i]);
            if(i==s.length-1){
                s2=s2+res;
            }
            else{
                s2=s2+res+" ";
            }
        }
        return s2;
        
    }
    public String capitalize(String res){
        if(res.length()<=2){
            return res.toLowerCase();
        }
        else{
            String an=res.substring(0,1);
            an=an.toUpperCase();
            return an+res.substring(1).toLowerCase();
        }
    }
}