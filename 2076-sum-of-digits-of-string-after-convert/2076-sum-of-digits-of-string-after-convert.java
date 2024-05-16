class Solution {
    public int getLucky(String s, int k) {
        String sum="";
        for(int i=0;i<s.length();i++){
            sum=sum+(((s.charAt(i)+0)-97)+1)+"";
        }
        int sum1=0;
        for(int i=0;i<sum.length();i++){
            sum1=sum1+Integer.parseInt(sum.substring(i,i+1));
        }
        System.out.println(sum1);
        int ans=0;
    while(k!=1){
        ans=0;
        while(sum1!=0){
            ans=ans+(sum1%10);
            sum1=sum1/10;
        }
        sum1=ans;
        k--;

    }
    return sum1;
        
    }
}