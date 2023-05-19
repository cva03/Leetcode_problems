package puzzle;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(solve("malayalamadam",""));
    }


    static String solve(String str,String result){
        for(int i=0;i<str.length();i++){
            String temp=checkPalindrome(str,i,false);
            if(temp.length()>result.length()){
                result=temp;
            }
            if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                temp=checkPalindrome(str,i,true);
            }
            if(temp.length()>result.length()){
                result=temp;
            }
        }
        return result;
    }

    static String checkPalindrome(String str,int index,boolean twin){
        String result="";
        int start=index-1;
        int end=index+1;
        if(twin){
            start=index;
            end=index+1;
        }else{
            result=str.charAt(index)+"";
        }
        while(start>=0 && end<str.length()){
            if(str.charAt(start)==str.charAt(end)){
                result=str.charAt(start)+result+str.charAt(end);
                start--;
                end++;
            }else{
                break;
            }
        }
        return result;
    }
}
