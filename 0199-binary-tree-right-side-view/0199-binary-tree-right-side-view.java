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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> arr=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        if(root==null){
            return arr;
        }
        while(!qu.isEmpty()){
            int size=qu.size();
            for(int i=0;i<size;i++){
                TreeNode curr=qu.remove();
                if(curr.left!=null){
                    qu.offer(curr.left);
                }
                if(curr.right!=null){
                    qu.offer(curr.right);
                }
                if(i==size-1){
                    arr.add(curr.val);
                }

                
            }
        }
        return arr;
        
    }
}