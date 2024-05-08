class Solution {
    public int numRookCaptures(char[][] board) {
        int arr[]=new int[2];
        pos(board,arr);
        int arr1[]=new int[1];
        count(board,arr[0],arr[1],arr1);
        return arr1[0];
        
    }
    public void pos(char [][]board,int arr[]){
        boolean var=true;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                if(board[i][j]=='R'){
                    arr[0]=i;
                    arr[1]=j;
                    var=false;
                    break;
                }
            }
            if(var==false){
                break;
            }
        }
    }
    public void count(char board[][],int row,int col,int arr1[]){
        int up=row-1;
        while(up>=0){
            if(board[up][col]=='p'){
                arr1[0]=arr1[0]+1;
                break;
            }
            else{
                if(board[up][col]=='B'){
                    break;
                }
                up=up-1;
            }
        }
        int right=col+1;
        while(right<board.length){
            if(board[row][right]=='p'){
                arr1[0]=arr1[0]+1;
                break;

            }
            else{
                if(board[row][right]=='B'){
                    break;
                }
                right=right+1;
            }
        }
        int down=row+1;
        while(down<board.length){
            if(board[down][col]=='p'){
                arr1[0]=arr1[0]+1;
                break;

            }
            else{
                if(board[down][col]=='B'){
                    break;
                }
                down=down+1;
            }
        }
        int left=col-1;
        while(left>=0){
            if(board[row][left]=='p'){
                arr1[0]=arr1[0]+1;
                break;

            }
            else{
                if(board[row][left]=='B'){
                    break;
                }
                left=left-1;
            }
        }



        }
    }
