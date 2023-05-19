package recursion.strings;

public class q1 {
    public static void main(String[] args) {
        System.out.println(skipACharacter('a',"abcaaaaaaaaaacad"));

    }
    private static String skipACharacter(char ch, String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.charAt(0)==ch){
            return skipACharacter(ch,up.substring(1));
        }else{
            return up.charAt(0)+ skipACharacter(ch,up.substring(1));
        }
    }

}
