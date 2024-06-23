class Solution {
    public int minAddToMakeValid(String s) {
       Stack<Character> st=new Stack<>();

        for(int i=0;i<s.length();i++){
            if(!s.isEmpty()){
            if(s.charAt(i)=='(' ){
                st.push('(');
            }
            else if(!st.isEmpty() &&s.charAt(i)==')' && st.peek()=='('){
                st.pop();
                
            }
            else{
                st.push(s.charAt(i));
            }
            }
            else{
                st.push(s.charAt(i));
            }
           

        }
         return st.size();
        
    }
}