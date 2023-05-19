package recursion;

public class Sudoko {

    public static void main(String[] args) {
        int[][] board={
                {3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}
        };
        solve(board,0,0);
    }

    private static void solve(int[][] board, int row ,int col){
        if(row==board.length-1 && col==board.length){
            printBoard(board);
            System.out.println();
            return;
        }
        if(col==board.length){
            row++;
            col=0;
        }
        if(board[row][col]!=0){
            solve(board,row,col+1);
            return;
        }
        for(int i=1;i<=9;i++){
            if(checkSafe(board,row,col,i)){
                board[row][col]=i;
                solve(board,row,col+1);
            }
        }
        board[row][col]=0;
    }

    private static boolean checkSafe(int[][] board, int row, int col, int num) {
        for(int i=0;i<board.length;i++){
            if(num==board[i][col] || num==board[row][i]){
                return false;
            }
        }
        int startRow=(row/3)*3;
        int startCol=(col/3)*3;
        for(int i=startRow;i<startRow+3;i++){
            for(int j=startCol;j<startCol+3;j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }

    private static void printBoard(int[][] board) {
        for(int[] b: board){
            for(int num:b){
                System.out.print(num+"  ");
            }
            System.out.println();
        }
    }
}
