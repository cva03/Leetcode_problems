package leetcode.array;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverseBits( -3));
    }
    public static int reverseBits(int n) {
        String one="";
        int num=0;
        for(int i=0;i<32;i++){
            num=num+ (int)(((n&1)==1)?Math.pow(2,32-(i+1)):0);
            n=n>>1;
        }
        return num;


    }
}
