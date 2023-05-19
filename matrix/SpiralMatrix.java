package matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }
    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans=new ArrayList<>();
        int stage=0;
        int row=matrix.length;
        int col=matrix[0].length;
        while(ans.size()<(row*col)){
            for(int c=stage;c<col-stage;c++){
                ans.add(matrix[stage][c]);
            }
            for(int r=stage+1;r<row-stage;r++){
                ans.add(matrix[r][col-stage-1]);
            }
            for(int c=col-stage-2;c>=stage;c--){
                ans.add(matrix[row-stage-1][c]);
            }
            for(int r=row-stage-2;r>stage;r--){
                ans.add(matrix[r][stage]);
            }
            stage++;
        }
        return ans;
    }
}
