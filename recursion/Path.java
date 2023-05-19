package recursion;

import java.util.ArrayList;
import java.util.List;

public class Path {
    public static void main(String[] args) {
        int[][] board={
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        System.out.println(printPathWithDiagonal("",0,0,board));
    }
    static List<String> printPath(String path, int row , int col, int[][] arr){
        if(row==arr.length-1 && col==arr[0].length-1){
            List<String> list=new ArrayList<>();
            list.add(path);
            return list;
        }
        List<String> list=new ArrayList<>();
        if(row<arr.length){
            list.addAll(printPath(path+'D',row+1,col,arr));
        }
        if(col< arr.length) {
            list.addAll(printPath(path+'R',row,col+1,arr));
        }
        return list;
    }

    static List<String> printPathWithDiagonal(String path, int row , int col, int[][] arr){
        if(row==arr.length-1 && col==arr[0].length-1){
            List<String> list=new ArrayList<>();
            list.add(path);
            return list;
        }
        List<String> list=new ArrayList<>();
        if(row<arr.length && col<arr[0].length){
            list.addAll(printPathWithDiagonal(path+"T",row+1,col+1,arr));
        }
        if(row<arr.length-1){
            list.addAll(printPathWithDiagonal(path+'D',row+1,col,arr));
        }
        if(col< arr.length-1) {
            list.addAll(printPathWithDiagonal(path+'R',row,col+1,arr));
        }
        return list;
    }
}
