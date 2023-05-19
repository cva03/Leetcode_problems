package puzzle;

import java.util.ArrayList;
import java.util.List;

public class ABCselvam {
    static int in=0;
    public static void main(String[] args) {
        System.out.println(solve(4,new ArrayList<>()));
    }

    static int solve(int n,List<Character> str){
        int count=0;
        if(str.size()==n){
            if(check(str)){
                System.out.println(str);
                return 1;
            }
            return 0;
        }
        for(int i=0;i<3;i++){
            str.add((char) (i+'a'));
            count+=solve(n,str);
            str.remove(str.size()-1);
        }
        return count;
    }


    static boolean check(List<Character> str){
        int bCount=0;
        int cCount=0;
        for(char c:str){
            if(c=='b'){
                bCount++;
            }if(c=='c'){
                cCount++;
            }
        }
        if(bCount>1){
            return false;
        }
        return cCount <= 2;
    }
}
