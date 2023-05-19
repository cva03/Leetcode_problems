package puzzle;

public class Selvamfibo {
    public static void main(String[] args) {
        int n=14;
        int fib=fibo(14);
        System.out.println(fib%10);
    }
    static int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }
}
