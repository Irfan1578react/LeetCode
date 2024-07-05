class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> q=new LinkedList<>();
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<students.length;i++){
            q.add(students[i]);
        }
        for(int i=sandwiches.length-1;i>=0;i--){
            s.add(sandwiches[i]);
        }
        
        int i=0;
        while(!q.isEmpty() && i<q.size()){
            if(q.peek()==s.peek()){
                s.pop();
                q.remove();
                i=0;
            }
           
            else{
                q.add(q.remove());
                i++;
                

            }
            
        }
        return q.size();
        
        
    }
}