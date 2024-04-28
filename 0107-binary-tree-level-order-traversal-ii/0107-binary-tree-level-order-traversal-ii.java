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
 */class Solution {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        else{
            Queue<TreeNode> qt=new LinkedList<>();
            qt.offer(root);
            while(!qt.isEmpty()){
                int currsize=qt.size();
                List<Integer> currlevel=new ArrayList<>();
                for(int i=0;i<currsize;i++){
                    TreeNode cr=qt.poll();
                    currlevel.add(cr.val);
                    if(cr.left!=null){
                        qt.offer(cr.left);
                    }
                    if(cr.right!=null){
                        qt.offer(cr.right);
                    }
                }
                res.add(currlevel);
            }
        }
        List<List<Integer>> res1=new ArrayList<>();
        for(int i=res.size()-1;i>=0;i--){
            List<Integer> ans1=new ArrayList<>();
            for(int j=0;j<res.get(i).size();j++){
                ans1.add(res.get(i).get(j));
            }
            res1.add(ans1);
        }
        return res1;
        
    }
}