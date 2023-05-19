package dynamicprogramming;

public class ValidPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        char[] str=s.toLowerCase().toCharArray();
        int start=0;
        int end=str.length-1;
        while(start<end){
            while((start<end) && !((str[start]>='a' && str[start]<='z') ||
                    (str[start]>='0' && str[start]<='9'))){
                start++;
            }
            while((start<end) && !((str[end]>='a' && str[end]<='z') ||
                    (str[end]>='0' && str[end]<='9'))){
                end--;
            }
            if(str[start++]!=str[end--]){
                return false;
            }
        }
        return true;
    }
}
