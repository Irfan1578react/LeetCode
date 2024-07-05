class Solution {
    public String sortVowels(String s) {
        String ls[]=new String[s.length()];
        List<Character> upvow=new ArrayList<>();
        List<Character> lowvow=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!='A' && s.charAt(i)!='a' && s.charAt(i)!='E' && s.charAt(i)!='e' &&s.charAt(i)!='I' &&s.charAt(i)!='i' &&s.charAt(i)!='O' &&s.charAt(i)!='o' &&s.charAt(i)!='U' &&s.charAt(i)!='u'){
                ls[i]=s.charAt(i)+"";
            }
            else{
                int val=s.charAt(i)-0;
                System.out.println(val);
                if(val<97){
                    upvow.add(s.charAt(i));
                }
                else{
                    lowvow.add(s.charAt(i));
                }
            }
        }
        Collections.sort(upvow);
        System.out.println(upvow);
        System.out.println(lowvow);
        int curr=0;
        int curr2=0;
        Collections.sort(lowvow);
        for(int i=0;i<ls.length && curr<upvow.size();i++){
            if(ls[i]==null){
                ls[i]=upvow.get(curr)+"";
                curr++;
            }
        }
        for(int i=0;i<ls.length && curr2<lowvow.size();i++){
            if(ls[i]==null){
                ls[i]=lowvow.get(curr2)+"";
                curr2++;
            }
        }
        String ans="";
        for(int i=0;i<ls.length;i++){
            ans=ans+ls[i];
        }
        return ans;
        
    }
}