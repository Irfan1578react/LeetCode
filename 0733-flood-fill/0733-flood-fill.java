class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int val=image[sr][sc];
        if(val==color){
            return image;
        }
        helper(image,sr,sc,color,val);
        return image;
        
    }
    public void helper(int [][] image,int sr,int sc,int color,int val){
        // if((sr==0 && sc==0 ) ){
        //     if(image[sr][sc]==val){
        //         image[sr][sc]=color;
        //         return;
        //     }
        //     else{
        //         return;
        //     }
        // }
        // if((sr==image.length && sc==image[0].length)){
        //     return;
        // }

        // if(sr>0 && image[sr][sc]==val){
        //     int temp=image[sr][sc];
        //     image[sr][sc]=color;
        //     helper(image,sr-1,sc,color,val);


        // }
        // if(sc>0&& image[sr][sc]==val){
        //     image[sr][sc]=color;
        //     helper(image,sr,sc-1,color,val);
        // }
        // if(sr<image.length && image[sr][sc]==val){
        //     image[sr][sc]=color;
        //     helper(image,sr+1,sc,color,val);
        // }
        // if(sc<image[0].length && image[sr][sc]==1){
        //     image[sr][sc]=color;
        //     helper(image,sr,sc+1,color,val);
        // }
        if(sr<0 || sr>=image.length || sc<0 || sc>=image[0].length || image[sr][sc]!=val){
            return;
        }
        
        image[sr][sc]=color;
        helper(image,sr-1,sc,color,val);
        helper(image,sr+1,sc,color,val);
        helper(image,sr,sc+1,color,val);
        helper(image,sr,sc-1,color,val);
    }
}