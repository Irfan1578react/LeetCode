class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(deck);
    
        for(int i=deck.length-1;i>=0;i--){
            
            List<Integer> arr=new ArrayList<>();
            arr.add(deck[i]);

                if(res.isEmpty()){
                    res.addAll(arr);
                }
                else{
                    arr.add(res.get(res.size()-1));
                    res.remove(res.size()-1);
                    arr.addAll(res);
                    res.clear();
                    res.addAll(arr);
                    
                }

            }
            int []ans3=new int[res.size()];
            for(int i=0;i<res.size();i++){
                ans3[i]=res.get(i);
            }
            return ans3;
        }
        
    }
