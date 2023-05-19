package dynamicprogramming;

public class LongestIncresingSubsequence {
    public static void main(String[] args) {
        System.out.println(lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
    }
    public static int lengthOfLIS(int[] nums) {
        int max = 1;
        int[] dp = new int[nums.length];
        for (int i = nums.length - 1; i >= 0; i--) {
            dp[i] = 1;
            for (int j = i; j < nums.length; j++) {
                if (nums[i] < nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
