package puzzle;

public class Strobogrammatic {
    public static void main(String[] args) {
        System.out.println(check(10001));
    }

    private static boolean check(int num){
        String str=String.valueOf(num);
        for(int i=0,index=str.length()-1;i<str.length()/2+1;i++,index--){
            char ch=str.charAt(i);
            char nextCh=str.charAt(index);
            if(!(ch=='9' && nextCh=='6') && !(ch=='6' && nextCh=='9') && !(ch=='8' && nextCh=='8') && !(ch=='1' && nextCh=='1') && !(ch=='0'&& nextCh=='0')){
                return false;
            }
        }
        return true;
    }
}
