package dynamicprogramming;

public class JumpGame {
    public static void main(String[] args) {
        System.out.println(canJump(new int[]{2,0}));
    }
    public static boolean canJump(int[] nums) {
        int len=nums.length;
        boolean[] dp=new boolean[len];
        dp[0]=true;
        for(int i=0;i<len;i++){
            int steps=nums[i];
            while(steps>0){
                if(i+steps<len) {
                    dp[i + steps] = true;
                }
                steps--;
            }
        }
        return dp[len-1];
    }
}
