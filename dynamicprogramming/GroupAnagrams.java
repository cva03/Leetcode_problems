package dynamicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        List<String> str=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] ch=strs[i].toCharArray();
            Arrays.sort(ch);
            str.add(String.valueOf(ch));
        }
        List<List<String>> res=new ArrayList<>();
        for(int i=0;i<str.size();i++){
            if(!str.get(i).equals("!")){
                List<String> temp=new ArrayList<>();
                temp.add(strs[i]);
                for(int j=i+1;j<str.size();j++){
                    if(str.get(i).equals(str.get(j))){
                        temp.add(strs[j]);
                        str.set(j,"!");
                    }
                }
                res.add(temp);
            }
        }
        return res;
    }
}
