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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> arr=new ArrayList<>();
        Queue<TreeNode> qu=new LinkedList<>();
        qu.offer(root);
        if(root==null){
            return arr;
        }
        else{
            int level=0;
            while(!qu.isEmpty()){
                int levelsize=qu.size();
                List<Integer> arr1=new ArrayList<>();
                for(int i=0;i<levelsize;i++){
                    TreeNode ans=qu.remove();
                    arr1.add(ans.val);
                    if(ans.left!=null){
                        qu.offer(ans.left);
                    }
                    
                    if(ans.right!=null){
                        qu.offer(ans.right);
                    }
                }
                if(level%2!=0){
                int h=0;
                int j=arr1.size()-1;
                while(h<j){
                    int temp=arr1.get(h);
                    arr1.set(h,arr1.get(j));
                    arr1.set(j,temp);
                    h++;
                    j--;
                }
                }
                arr.add(arr1);
                level++;
            }
        }
        return arr;
    }
}