package recursion;

public class Nknights {
    public static void main(String[] args) {
        solve(new boolean[4][4],0,0,4);
    }

    static void solve(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            printBoard(board);
            System.out.println();
            return;
        }
        if(col==board.length && row==board.length-1){
            return;
        }
        if (col >= board.length) {
            solve(board, row + 1, 0, knights);
            return;
        }
        if (isSafe(board, row, col)) {
            board[row][col] = true;
            solve(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }
        solve(board,row,col+1,knights);
    }

    private static void printBoard(boolean[][] board) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++) {
                if (board[i][j]) {
                    System.out.print("K ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if(isValid(board,row-2,col-1) && board[row-2][col-1]) {
            return false;
        }
        if( isValid(board,row-2,col+1) && board[row-2][col+1] ) {
            return false;
        }
        if(isValid(board,row-1,col+2) && board[row-1][col+2]){
            return false;
        }
        if(isValid(board,row-1,col-2) && board[row-1][col-2]){
            return false;
        }
        return true;
    }

    private static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && col >= 0 && col < board.length && row < board.length;
    }
}
