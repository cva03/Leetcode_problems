package recursion;

import java.util.ArrayList;
import java.util.List;

public class PhonePad {
    public static void main(String[] args) {
        List<String> strs=print("","123");
        int count=count("","123");
        System.out.println(strs.size()+" "+count);
    }
    static List<String> print(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            List<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> lists=new ArrayList<>();
        int num=up.charAt(0)-'0';
        for(int i= (num-1)*3;i<num*3;i++){
            char ch= (char) ('a'+i);
            lists.addAll(print(p+ch,up.substring(1)));
        }
        return lists;
    }

    static int count(String p, String up){
        if(up.isEmpty()){
            return 1;
        }
        int num=up.charAt(0)-'0';
        int count=0;
        for(int i=(num-1)*3; i<num*3;i++){
            count=count+count(p+('a'+i),up.substring(1));
        }
        return count;
    }
}
