package recursion.strings;

public class SkipAWord {
    public static void main(String[] args) {
        System.out.println(solve("apple","abcapplecad"));

    }
    private static String solve(String rem, String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith(rem)){
            return solve(rem,up.substring(rem.length()));
        }else{
            return up.charAt(0)+ solve(rem,up.substring(1));
        }
    }
}
