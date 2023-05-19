package matrix;

public class CyclicRotate {
    public static void main(String[] args) {
       solve(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});
    }
    private static void solve(int[][] arr){
        int top=0,left=0;
        int right=arr[0].length;
        int bottom=arr.length;
        while(top<bottom-1){
            int last=arr[top+1][top];
            for(int i=top;i<right;i++) {
                int temp = arr[top][i];
                arr[top][i] = last;
                last = temp;
            }
            top++;
            for(int i=left+1;i<bottom;i++){
                int temp=arr[i][right-1];
                arr[i][right-1]=last;
                last=temp;
            }
            right--;
            for(int i=right-1;i>=left;i--){
                int temp=arr[bottom-1][i];
                arr[bottom-1][i]=last;
                last=temp;
            }
            bottom--;
            for(int i=bottom-1;i>=top;i--){
                int temp=arr[i][left];
                arr[i][left]=last;
                last=temp;
            }
            left++;
        }
    }

}
