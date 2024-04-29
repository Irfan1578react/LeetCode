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
    public boolean isCousins(TreeNode root, int x, int y) {
        TreeNode xx=findNode(root,x);
        TreeNode yy=findNode(root,y);
        int levelx=level(root,xx,0);
        int levely=level(root,yy,0);
        return levelx==levely && (!issibling(root,xx,yy));
        
    }
    public static TreeNode findNode(TreeNode root,int x){
        if(root==null){
            return null;
        }
        if(root.val==x){
            return root;
        }
        TreeNode left=findNode(root.left,x);
        if(left!=null){
            return left;
        }
        return findNode(root.right,x);
    }
    public static int level(TreeNode root,TreeNode xx,int level){
    if(root==null){
        return 0;
    }
    if(root==xx){
        return level;
    }
    int left=level(root.left,xx,level+1);
    //because if this wont given means it has no right call;
    if(left!=0){
        return left;
    }
    return level(root.right,xx,level+1);
    }
    public boolean issibling(TreeNode root,TreeNode x,TreeNode y){
        if(root==null){
            return false;
        }
        return (root.left==x &&root.right==y)||(root.right==x &&root.left==y) ||
        issibling(root.left,x,y)||issibling(root.right,x,y);
        
    }
}