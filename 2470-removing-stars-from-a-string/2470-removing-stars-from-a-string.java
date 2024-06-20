class Solution {
    public String removeStars(String s) {
       Stack<String> res=new Stack<>();
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='*'){
            res.pop();
        }
        else{
            res.push(s.substring(i,i+1));
        }

       }
       String res1="";
       while(!res.isEmpty()){
        res1=res.pop()+res1;
       }
       return res1;
    }
    
}