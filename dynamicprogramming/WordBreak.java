package dynamicprogramming;

import java.util.ArrayList;
import java.util.List;

public class WordBreak {
    public static void main(String[] args) {
        List<String > list=new ArrayList<>();
        list.add("leet");
        list.add("code");
        System.out.println(wordBreak("leetcode",list));
    }
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] dp=new boolean[s.length()+1];
        dp[s.length()]=true;
        for(int i=s.length();i>=0;i--){
            for(String str: wordDict){
                if(((s.length()-i) >= str.length()) && (s.substring(i,i+str.length())).equals(str) ){
                       dp[i] = dp[i + str.length()];
                }
                if(dp[i]){
                    break;
                }
            }
        }
        return dp[0];
    }
}
