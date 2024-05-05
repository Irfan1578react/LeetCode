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
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        List<Integer> res=new ArrayList<>();
        inorder(root1,res);
        inorder(root2,res);
        Collections.sort(res);
        return res;
    }
    public void inorder(TreeNode root1,List<Integer> res){
        if(root1==null){
            return;

        }
        else{
            inorder(root1.left,res);
            res.add(root1.val);
            inorder(root1.right,res);
        }
    }

}