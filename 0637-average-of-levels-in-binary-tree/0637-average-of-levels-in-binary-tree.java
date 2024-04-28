/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> arr=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        while(!qu.isEmpty()){
            int size=qu.size();
            double ans=0;
            for(int i=0;i<size;i++){
                TreeNode val=qu.remove();
                ans+=val.val;
                if(val.left!=null){
                    qu.offer(val.left);
                }
                
                if(val.right!=null){
                    qu.offer(val.right);
                }

            }
            if(size==1){
                arr.add(ans);
            }
            else{
                arr.add(ans/size);
            }
        }

      return arr;  
    }
}