package recursion;

public class Nqueens {
    static int count=1;
    public static void main(String[] args) throws InterruptedException {
        solve(new boolean[4][4],0);
    }

    static void solve(boolean board[][],int row) throws InterruptedException {
        if(row==board.length){
            printBoard(board);
            System.out.println();
            return;
        }
        for(int i=0;i<board.length;i++){
            if(checkSafe(board,row,i)){
                board[row][i]=true;
                solve(board,row+1);
                board[row][i]=false;
            }
        }
    }

    private static boolean checkSafe(boolean[][] board, int row, int col) {
        for(int i=row;i>=0;i--){
            if(board[i][col]){
                return false;
            }
        }
        for(int i=row,j=col;i>=0 && j<board.length;i--,j++ ){
            if(board[i][j]){
                return false;
            }
        }
        for(int i=row,j=col; i>=0 && j>=0; i-- , j--){
            if(board[i][j]){
                return false;
            }
        }
        return true;
    }

    private static void printBoard(boolean[][] board) throws InterruptedException {
        Thread.sleep(300);
        for(boolean[] arr: board){
            for(boolean state:arr){
                if(state)
                    System.out.print("Q ");
                else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }

}
