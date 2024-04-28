/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public Node connect(Node root) {
        Node temp=root;
        
        if(root==null){
            return null;
        }
        else{
            Queue<Node> qt=new LinkedList<>();
            qt.offer(root);
            while(!qt.isEmpty()){
                int currsize=qt.size();
                
                for(int i=0;i<currsize;i++){
                    
                    Node cr=qt.poll();
                    
                    if(cr.left!=null){
                        qt.offer(cr.left);
                    }
                    if(cr.right!=null){
                        qt.offer(cr.right);
                    }
                    if(i==currsize-1){
                        cr.next=null;
                    }
                    else{
                        cr.next=qt.peek();
                    }
                }
                
            }
        }
        return temp;
        
    }
}