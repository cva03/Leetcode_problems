package dynamicprogramming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public static void main(String[] args) {
        System.out.println(mostCommonWord("Bob",new String[]{}));
    }
    public  static String mostCommonWord(String paragraph, String[] banned) {
        HashSet<String> set=new HashSet<>(Arrays.asList(banned));
        HashMap<String,Integer> map=new HashMap<>();
        String str="";
        String res="";
        int maxCount=0;
        for(char ch:paragraph.toLowerCase().toCharArray()){
            if(ch>='a' && ch<='z'){
                str+=ch;
            }else if(!str.equals("") && !set.contains(str)){
                map.put(str,map.getOrDefault(str,0)+1);
                if(maxCount<map.get(str)){
                    maxCount=map.get(str);
                    res=str;
                }
                str="";
            }else{
                str="";
            }
        }
        return res;

    }
}
