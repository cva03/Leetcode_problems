package recursion.strings;

import java.util.Arrays;

public class BacktrackPath {
    public static void main(String[] args) {
        int[][] board={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        int[][] box=new int[3][3];
        printPath("",0,0,board,box,1);
    }

    static void path(String p, int r ,int c,int[][] board){
        if(r==board.length-1 && c==board[0].length-1){
            System.out.println(p);
            return;
        }
        if(board[r][c]!=0){
            return;
        }
        board[r][c]=1;
        if(r<board.length-1){
            path(p+'D',r+1,c,board);
        }
        if(c<board[0].length-1){
            path(p+'R',r,c+1,board);
        }
//        if(r<board.length-1 && c<board[0].length-1){
//            path(p+'T',r+1,c+1,board);
//        }
        if(r>0){
            path(p+'U',r-1,c,board);
        }
        if(c>0){
            path(p+'L',r,c-1,board);
        }
        board[r][c]=0;
    }

    static void printPath(String p, int r ,int c,int[][] board,int[][] path,int step){
        if(r==board.length-1 && c==board[0].length-1){
            path[r][c]=step;
            for(int[] box: path){
                System.out.println(Arrays.toString(box));
            }
            System.out.println(p);
            System.out.println();
            return;
        }
        if(board[r][c]!=0){
            return;
        }
        board[r][c]=1;
        path[r][c]=step;
        if(r<board.length-1){
            printPath(p+'D',r+1,c,board,path,step+1);
        }
        if(c<board[0].length-1){
            printPath(p+'R',r,c+1,board,path,step+1);
        }
        if(r>0){
            printPath(p+'U',r-1,c,board, path, step+1) ;
        }
        if(c>0){
            printPath(p+'L',r,c-1,board, path, step+1);
        }
        board[r][c]=0;
        path[r][c]=0;
    }
}
