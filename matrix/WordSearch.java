package matrix;

public class WordSearch {
    public static void main(String[] args) {
        exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
    }

    public static boolean exist(char[][] board, String word) {
        char[] str=word.toCharArray();
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(recur(board,i,j,0,str)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean recur(char[][] board,int i,int j,int len,char[] str){
        if(len==str.length){
            return true;
        }
        if(i<0 || j<0 || j>=board[0].length ||  i>=board.length || board[i][j]!=str[len] || board[i][j]=='!'){
            return false;
        }
        char temp=board[i][j];
        board[i][j]='!';
        len++;
        boolean res= recur(board,i+1,j,len,str) ||
                recur(board,i,j+1,len,str) ||
                recur(board,i-1,j,len,str) ||
                recur(board,i,j-1,len,str);
        board[i][j]=temp;
        return res;
    }
}
