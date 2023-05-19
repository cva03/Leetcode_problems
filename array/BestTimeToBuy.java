package leetcode.array;

public class BestTimeToBuy {
    public static void main(String[] args) {
        int arr[]=new int[]{7,6,4,3,1};
        System.out.println( maxProfit(arr));
    }
    public static int maxProfit(int[] prices) {
        int min=Integer.MIN_VALUE;
        for(int i=prices.length-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(min<(prices[i]-prices[j]) ){
                    min=prices[i]-prices[j];
                }
            }
        }
       return Math.max(min, 0);
    }
    public static int maxProfit2(int[] prices) {
        int prevMin = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < prevMin) {
                prevMin = prices[i];
            } else if (prices[i] - prevMin > profit) {
                profit = prices[i] - prevMin;
            }
        }
        return profit;
    }
}
