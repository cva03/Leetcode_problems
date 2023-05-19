package dynamicprogramming;

public class UniquePaths {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,7));
    }
    public static int uniquePaths(int m, int n) {
        int[] dp=new int[n+1];
        dp[n-1]=1;
        for(int i=0;i<m;i++){
            int[] temp=new int[n+1];
            for(int j=dp.length-2;j>=0;j--){
                temp[j]=temp[j+1]+dp[j];
            }
            dp=temp;
        }
        return dp[0];
    }
}
