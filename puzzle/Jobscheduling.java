package puzzle;

public class Jobscheduling {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,1},new int[]{2,3,4}, new int[]{5,6,4},0,0,0));
    }
    private static int solve(int[] starTime, int[] endTime, int[] profits, int endtime, int profit,int result) {
        if(endtime>=endTime[endTime.length-1]){
            return Math.max(result, profit);
        }

        for (int i = 0; i < starTime.length; i++) {
            if (starTime[i] >= endtime) {
                profit += profits[i];
                result= solve(starTime, endTime, profits, endTime[i], profit,result);
                profit -= profits[i];
            }
        }
        return Math.max(profit,result);
    }
}
