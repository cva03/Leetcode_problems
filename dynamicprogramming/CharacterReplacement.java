package dynamicprogramming;

import java.util.HashMap;

public class CharacterReplacement {
    public static void main(String[] args) {
        System.out.println(characterReplacement("ABAB",2));
    }
    public static int characterReplacement(String s, int k) {
        char[] arr=s.toCharArray();
        int left=0;
        HashMap<Character,Integer> map=new HashMap<>();
        int res=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
            max=Math.max(max,map.get(ch));
            if((right-left+1)-max>k){
                char rem=s.charAt(left);
                map.put(rem,map.get(rem)-1);
                left++;
            }
            res=Math.max(right-left+1,res);
        }
        return res;
    }
}
