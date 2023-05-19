package dynamicprogramming;

public class NumDecoding {
    public static void main(String[] args) {
        System.out.println(numDecodings("12"));
    }
    public static int numDecodings(String s) {
        int len=s.length();
        int[] dp=new int[len+1];
        dp[len]=1;
        dp[len-1]=(s.charAt(len-1)!='0'?1:0);
        for(int i=len-2;i>=0;i--){
            int first=Integer.valueOf(s.charAt(i)+"");
            int second=Integer.valueOf(s.charAt(i)+""+s.charAt(i+1));
            if(first>=1 && first<=9){
                dp[i]=dp[i+1];
            }
            if(second>=10 && second<=26 ){
                dp[i]+=dp[i+2];
            }
        }
        return dp[0];

    }
    public static int numDecodings2(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int n = s.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = s.charAt(0) != '0' ? 1 : 0;
        for (int i = 2; i <= n; i++) {
            int first = Integer.valueOf(s.substring(i - 1, i));
            int second = Integer.valueOf(s.substring(i - 2, i));
            if (first >= 1 && first <= 9) {
                dp[i] += dp[i-1];
            }
            if (second >= 10 && second <= 26) {
                dp[i] += dp[i-2];
            }
        }
        return dp[n];
    }
}
