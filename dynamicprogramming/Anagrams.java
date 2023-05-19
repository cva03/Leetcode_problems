package dynamicprogramming;

public class Anagrams {
    public static void main(String[] args) {
        System.out.println(isAnagram("","Group"));
    }
    public static boolean isAnagram(String s, String t) {
        char[] m=s.toCharArray();
        int[] map=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            map[s.charAt(i)-'a']++;
        }
        for(int i=0;i<t.length();i++){
            map[t.charAt(i)-'a']--;
        }
        for(int i=0;i<map.length;i++){
            if( map[i]!=0){
                return false;
            }
        }
        return true;
    }
}
