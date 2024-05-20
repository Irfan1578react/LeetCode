import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res=new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String a=""+separator;
            String ans[]=(words.get(i)).split(Pattern.quote(a));
            for(int j=0;j<ans.length;j++){
                if(ans[j].isEmpty()){
                    continue;
                }
                res.add(ans[j]);
            }
        }
        return res;
    }
}