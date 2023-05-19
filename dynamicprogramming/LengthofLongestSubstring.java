package dynamicprogramming;

import java.util.HashMap;
import java.util.HashSet;

public class LengthofLongestSubstring {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("pwpkew"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Integer,Integer> map=new HashMap<>();

        map.put(1,1);
        map.put(2,4);
        map.put(0,3);

        System.out.println(map.get(4));
        int len=s.length();
        int l=0;
        int res=0;
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<len;i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(i));
            res=Math.max(res,i-l+1);
        }
        return res;
    }
}
