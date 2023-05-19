package recursion;

import java.util.Scanner;

public class Fibanocci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(fib(sc.nextInt()));

    }

    static void fibo(int n1,int index,int num, int res){
        if(num<=2){
            System.out.println(num-1);
            return;
        }
        if(index==num-1){
            System.out.println(res);
            return;
        }
        res= res+n1;
        fibo(res,index+1,num,n1);
    }

    static int fib(int n){
        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
}
