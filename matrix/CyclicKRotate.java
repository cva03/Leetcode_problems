package matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


abstract class Check{
    public void draw(){
        System.out.println("hi");
    }
}
public class CyclicKRotate extends Check {

    public void draw(){
        System.out.println("overRIded");
    }

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        System.out.println(sb.append("hi da bynd"));
        System.out.println(sb.delete(sb.length()-9,sb.length()));
        HashSet<Character> set=new HashSet<>();
        Check matr=new CyclicKRotate();
        matr.draw();

        rotateGrid(new int[][]{{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}},2);
        int n=0;
        int m=2*(n);
    }

    public static int[][] rotateGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        int x=0;
        int y=0;
        while(m>0 && n>0){
            partition(grid,m,n,x,y,k);
            m=m-2;
            n=n-2;
            x++;
            y++;
        }
        return grid;
    }

    public static void partition(int[][] grid,int m,int n,int x, int y,int k){
        int len=2*(m+n-2);
        int[] arr=new int[len];
        int pointer=0;
        int topLimit=x;
        for(;x<m+topLimit;x++){
            arr[pointer++]=grid[x][y];
        }
        x--;
        y++;
        for(;y<n+topLimit;y++){
            arr[pointer++]=grid[x][y];
        }
        x--;
        y--;
        for(int start=x;x>=topLimit;x--){
            arr[pointer++]=grid[x][y];
        }
        x++;
        y--;
        for(int start=y;y>topLimit;y--){
            arr[pointer++]=grid[x][y];
        }
        k=k%len;
        rotate(arr,len,k);
        change(grid,arr,m,n,topLimit);
    }

    public static void change(int[][] grid,int[] arr,int m,int n,int topLimit){
        int x=topLimit;
        int y=topLimit;
        int pointer=0;
        for(;x<m+topLimit;x++){
            grid[x][y]=arr[pointer++];
        }
        x--;
        y++;
        for(;y<n+topLimit;y++){
            grid[x][y]=arr[pointer++];
        }
        y--;
        x--;
        for(int start=x;x>=topLimit;x--){
            grid[x][y]=arr[pointer++];
        }
        y--;
        x++;
        for(int start=y;y>topLimit;y--){
            grid[x][y]=arr[pointer++];
        }
    }

    public static void  rotate(int[] arr,int len, int k){
        List<Integer> list=new ArrayList<>();
        for(int i=len-k;i<len;i++){
            list.add(arr[i]);
        }
        for(int i=len-k-1;i>=0;i--){
            arr[i+k]=arr[i];
        }
        for(int i=0;i<k;i++){
            arr[i]=list.get(i);
        }
    }











}
