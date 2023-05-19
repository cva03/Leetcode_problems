package recursion;

import java.util.ArrayList;
import java.util.List;

public class Dice {
    public static void main(String[] args) {
        List<String> strs=solve("",4);
        System.out.println(strs);
    }
    static List<String> solve(String p, int target){
        if(target==0){
            List<String > list=new ArrayList<>();
            list.add(p);
            return list;
        }
        List<String> result=new ArrayList<>();
        for(int i=1;i<7 && i<=target;i++){
            result.addAll(solve(p+i,target-i));
        }
        return result;
    }
}
