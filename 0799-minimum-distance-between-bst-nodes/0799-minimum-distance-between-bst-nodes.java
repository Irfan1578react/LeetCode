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
    public int minDiffInBST(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        helper(root,arr);
        Collections.sort(arr);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.size()-1;i++){
            int y=arr.get(i+1)-arr.get(i);
            if(min>y){
                min=y;
            }
        }
        return min;
        
    }
    public void helper(TreeNode root,List<Integer> arr){
        if(root==null){
            return;
        }
        arr.add(root.val);
        helper(root.left,arr);
        helper(root.right,arr);
    }
}