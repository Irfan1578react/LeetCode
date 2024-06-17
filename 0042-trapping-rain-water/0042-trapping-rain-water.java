class Solution {
    public int trap(int[] height) {
        int sum=0;
        int n=height.length;
        int []l=new int[height.length];
        int []r=new int[height.length];
        l[0]=height[0];
        for(int i=1;i<n;i++){
            l[i]=Math.max(l[i-1],height[i-1]);
        }
        r[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            r[i]=Math.max(r[i+1],height[i+1]);
        }
        for(int i=0;i<height.length;i++){
            int val=Math.min(l[i],r[i])-height[i];
            if(val<0){
                continue;
            }
            else{
                sum=sum+val;
            }
            
            
        }
        return sum;
        
        
    }
    public int leftmax1(int end,int[] height){
            int max=-1;
            for(int i=0;i<=end;i++){
                if(max<height[i]){
                    max=height[i];
                }
            }
            if(max==-1){
                return 0;
            }
            else{
                return max;
            }
        }
        public int rightmax1(int start,int[] height){
            int max=-1;
            for(int i=start;i<height.length;i++){
                if(max<height[i]){
                    max=height[i];
                }

            }
            if(max==-1){
                return 0;
            }
            else{
                return max;
            }
        }
}