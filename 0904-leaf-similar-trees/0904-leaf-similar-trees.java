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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> arr=new ArrayList<>();
        List<Integer> arr1=new ArrayList<>();
        helper(root1,arr);
        helper(root2,arr1);
        
        return arr1.equals(arr);
        
        

        
    }
    public void helper(TreeNode root1,List<Integer> arr){
        if(root1==null){
            return;
        }
       
        else if(root1.left==null && root1.right==null){
            arr.add(root1.val);
            return;
        }

        
        
            helper(root1.left,arr);
            helper(root1.right,arr);
            
        
    
    }
}