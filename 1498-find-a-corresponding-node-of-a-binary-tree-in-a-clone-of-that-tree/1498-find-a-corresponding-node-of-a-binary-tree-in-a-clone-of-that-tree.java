/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        List<TreeNode> res=new ArrayList<>();
        helper(cloned,target,res);
        return res.get(0);
    }
    public void helper(TreeNode cloned,TreeNode target,List<TreeNode> res){
        if(cloned==null){
            return;
        }
        if(cloned.val==target.val){

            res.add(cloned);
            return ;
        }
        helper(cloned.left,target,res);
        helper(cloned.right,target,res);
    }
}