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
    public int sumNumbers(TreeNode root) {
        List<String> res=new ArrayList<>();
        helper(root,res,"");
        int rs=0;
        for(int i=0;i<res.size();i++){
            rs=rs+Integer.parseInt(res.get(i));
        }
        return rs;
        
    }
    public void helper(TreeNode root,List<String> res,String ans){
        if(root==null){
            
            return;
        }
        else if(root.left==null && root.right==null){
            ans=ans+root.val;
            res.add(ans);
            return;
        }
        helper(root.left,res,ans+root.val);
        
        helper(root.right,res,ans+root.val);
    }
}