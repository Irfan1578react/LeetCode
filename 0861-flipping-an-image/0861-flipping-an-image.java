class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int arr[][]=new int [image.length][image[0].length]; 
        for(int i=0;i<image.length;i++){
            int var=0;
            for(int j=image[i].length-1;j>=0;j--){
                if(image[i][j]==0){

                
                arr[i][var++]=1;
                
                }
                else{
                    arr[i][var++]=0;
                }
            }

        }
        return arr;
        
    }
}