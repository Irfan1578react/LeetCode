class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                    if(list1[i].equals(list2[j]) ){
                        if(min>i+j){
                            min=i+j;
                        }
                    }
            }
        }
        List<String> ans=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                    if(list1[i].equals(list2[j]) ){
                        if(min==i+j){
                            ans.add(list1[i]);
                        }
                    }
            }
        }
        String res[]=new String[ans.size()];
        for(int i=0;i<ans.size();i++){
            res[i]=ans.get(i);
        }
        return res;
        
    }
}