package matrix;

public class RotateMatrix {
    public static void main(String[] args) {
        rotate(new int[][]{{1,2,3,4,},{5,6,7,8},{9,10,11,12},{13,14,15,16}});
    }
    public static void rotate(int[][] matrix) {
        int left=0;
        int right=matrix.length;
        while(left<right){
            for(int i=0;i<right-left-1;i++){
                int temp=matrix[left][left+i];
                matrix[left][left+i]=matrix[right-1-i][left];
                matrix[right-1-i][left]=matrix[right-1][right-1-i];
                matrix[right-1][right-1-i]=matrix[left+i][right-1];
                matrix[left+i][right-1]=temp;
            }
            right--;
            left++;
        }
    }
}
