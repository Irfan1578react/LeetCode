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
    public boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> qu=new LinkedList<>();
        qu.add(root);
        if(root==null){
            return false;
        }
        while(!qu.isEmpty()){
            int size=qu.size();
            List<Integer> arr=new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode currlevel=qu.remove();
                
                if(currlevel.left!=null){
                    qu.offer(currlevel.left);
                    arr.add(currlevel.left.val);
                }
                else{
                    arr.add(1);
                }
                if(currlevel.right!=null){
                    qu.offer(currlevel.right);
                    arr.add(currlevel.right.val);
                }
                else{
                
                    arr.add(1);
                }
            }
            int k=0;
            int j=arr.size()-1;
            while(k<j){
                
                if(arr.get(k)==arr.get(j)){
                    k++;
               j--; 
                    continue;
                }
                else{
                    return false;
                }
               
            }
        }
        return true;
        
    }
}