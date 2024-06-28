class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(res,n,n,"");
        return res;
        
    }
    public void helper(List<String> res,int o,int c,String ans){
        if(o==0 && c==0 ){
            res.add(ans);
            return;
        }
        if(o>0){
        helper(res,o-1,c,ans+"(");
        }
        if(c>o && c>0){
        helper(res,o,c-1,ans+")");
        }
        
    }
    

}