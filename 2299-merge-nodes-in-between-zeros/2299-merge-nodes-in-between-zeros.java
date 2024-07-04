/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        List<Integer> arr=new ArrayList<>();
        while(head!=null){
            arr.add(head.val);
            head=head.next;
        }
        List<Integer> res=new ArrayList<>();
        int i=0;
        int j=1;
        int sum=0;
        while( i<arr.size() && j<arr.size()){
            if(arr.get(j)!=0){
                sum=sum+arr.get(j);
                j++;

            }
            else{
                res.add(sum);
                i=j;
                j=i+1;
                sum=0;
            }
            
        }
        ListNode head1=new ListNode(res.get(0));
        ListNode temp=head1;
        for(int h=1;h<res.size();h++){
            temp.next=new ListNode(res.get(h));
            temp=temp.next;
        }
        return head1;
        
    }
}