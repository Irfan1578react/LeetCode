class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res=new ArrayList<>();
        helper(res,"",n,n);
        return res;
    }
    public void helper(List<String> res,String ans,int o,int c){
        if(o==0 && c==0){
            res.add(ans);
        }
        if(o>0 ){
            helper(res,ans+"(",o-1,c);
        }
        if( c>o){
            helper(res,ans+")",o,c-1);
        }
    }
}