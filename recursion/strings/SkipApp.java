package recursion.strings;

public class SkipApp {
    public static void main(String[] args) {
        System.out.println(solve("apple","backappedah"));
    }

    private static String solve(String word,String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("app")){
            if(up.startsWith(word)){
                return word+solve(word,up.substring(word.length()));
            }else{
                return solve(word,up.substring(3));
            }
        }else{
            return up.charAt(0)+solve(word,up.substring(1));
        }
    }
}
