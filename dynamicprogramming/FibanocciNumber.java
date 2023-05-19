package dynamicprogramming;

public class FibanocciNumber {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }
    public static int fib(int n) {
        if(n<3){
            return 1;
        }
        int[] fibs=new int[n];
        fibs[0]=fibs[1]=1;
        for(int i=2;i<n;i++){
            fibs[i]=fibs[i-1]+fibs[i-2];
        }
        return fibs[n-1];
    }
}
