package dynamicprogramming;

public class MaxAlternatingSum {
    public static void main(String[] args) {
        System.out.println(maxAlternatingSum(new int[]{4,2,5,3}));
    }
    public static  long maxAlternatingSum(int[] nums) {
        int[][] res=new int[nums.length+1][2];
        res[0][1]=res[0][0]=0;
        for(int i=1;i<res.length;i++){
            res[i][0]=Math.max(res[i-1][0],res[i-1][1]-nums[i-1]);
            res[i][1]=Math.max(res[i-1][1],res[i-1][0]+nums[i-1]);
        }
        return res[nums.length][1];
    }
}
