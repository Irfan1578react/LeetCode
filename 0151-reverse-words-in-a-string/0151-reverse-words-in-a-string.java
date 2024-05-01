class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String res[]=s.split(" ");
        String ans="";
        List<String> res2=new ArrayList<>();
        for(int k=0;k<res.length;k++){
            if(res[k].isEmpty()){
                continue;
            }
            else{
                res2.add(res[k]);
            }
        }
        int i=0;
        int j=res2.size()-1;
        while(i<j){
            String temp=res2.get(i);
            res2.set(i,res2.get(j));
            res2.set(j,temp);
            i++;
            j--;
        }
        System.out.println(res2);
        for(int h=0;h<res2.size();h++){
            if(h==res2.size()-1){
                ans=ans+res2.get(h);
            }
            else{
                
                
                ans=ans+res2.get(h)+" ";
                
            }
        }
        return ans;
        
    }
}