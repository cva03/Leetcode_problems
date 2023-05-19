package dynamicprogramming;

public class CoinChange {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{1,2,5},11));
    }
    public static int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        int[] dp=new int[amount+1];
        for(int i=0;i<coins.length;i++){
            for(int j=1;j<=amount;j++){
                if(i==0){
                    dp[j]=dp.length;
                }
                if(j>=coins[i]){
                    dp[j]=Math.min(dp[j],dp[j-coins[i]]+1);
                }
            }
        }
        return (dp[amount]==dp.length)?-1:dp[amount];
    }

}
