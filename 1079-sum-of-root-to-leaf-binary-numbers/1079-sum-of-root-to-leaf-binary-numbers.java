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
    public int sumRootToLeaf(TreeNode root) {
        ArrayList<String> arr=new ArrayList<>();
        helper(arr,root,"");
        int sum=0;
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
        for(int i=0;i<arr.size();i++){
            int val=0;
            int ans=0;
            for(int j=arr.get(i).length()-1;j>=0;j--){
                if(arr.get(i).charAt(j)=='1'){
                    int r=(int)Math.pow(2,val);
                    int y=r*1;
                    ans=ans+y;
                }
                val++;

            }
            sum=sum+ans;

        }
        return sum;
        
        
        
    }
    public static void helper(ArrayList<String> arr,TreeNode root,String res){
        if(root==null){
            
            return;
        }
        if(root.left==null && root.right==null){
            res=res+root.val;
            arr.add(res);
            return;
        }
        helper(arr,root.left,res+root.val);
        
        helper(arr,root.right,res+root.val);


    }
}