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
    public int findSecondMinimumValue(TreeNode root) {
        Set<Integer> st=new HashSet<>();
        helper(root,st);
        List<Integer> res=new ArrayList<>();

        for(Integer it:st){
                res.add(it);

            }
        Collections.sort(res);
        if(st.size()==1){
            return -1;
        }
        else{
            return res.get(1);

            }
        
        }

        
    
    public void helper(TreeNode root,Set<Integer> st){
        if(root==null){
            return;
        }
        if(root.left==null && root.right==null){
            st.add(root.val);
        }
        helper(root.left,st);
        helper(root.right,st);
    }
}