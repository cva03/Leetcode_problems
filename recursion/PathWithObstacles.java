package recursion;

import java.util.ArrayList;
import java.util.List;

public class PathWithObstacles {
    public static void main(String[] args) {
        int[][] board={
                {0,0,0},
                {0,1,0},
                {0,0,0}
        };
        System.out.println(pathWithObstacles("",0,0,board));
    }
    static List<String> pathWithObstacles(String p, int row, int col, int[][] board){
        if(row==board.length-1 && col==board[0].length-1){
            List<String > temp=new ArrayList<>();
            temp.add(p);
            return temp;
        }
        List<String> list=new ArrayList<>();
        if(row<board.length-1 && board[row+1][col]==0){
            list.addAll(pathWithObstacles(p+'D',row+1,col,board));
        }
        if(col<board[0].length-1 && board[row][col+1]==0){
            list.addAll(pathWithObstacles(p+'R',row,col+1,board));
        }
        if(row<board.length-1 && col<board[0].length-1 && board[row+1][col+1]==0){
            list.addAll(pathWithObstacles(p+'T',row+1,col+1,board));
        }
        return list;
    }
}
