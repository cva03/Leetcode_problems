package puzzle;

import java.util.Scanner;

public class XXX {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=sc.nextInt();
        print(n,c);
    }
    static void  print(int n, int c){
        for(int i=0;i<n;i++){
            for(int j=0;j<n*c;j++){
                if((j+1)%n==0 && j+1!=n*c){
                    continue;
                }
                if(i==0 || i==n-1 ){
                        System.out.print("* ");
                        continue;
                }
                if((j+1)%n==i+1 || (i+j+1)%n==0){
                    System.out.print("* ");
                }else {
                         System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
