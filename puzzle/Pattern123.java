package puzzle;

public class Pattern123 {

    public static void main(String[] args) {
        print(1);
    }
    private static void print(int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=i;j++){
                printDecider(j);
            }
            for(int j=i-1;j>=0;j--){
                printDecider(j);
            }
            System.out.println();
        }
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=i;j++){
                printDecider(j);
            }
            for(int j=i-1;j>=0;j--){
               printDecider(j);
            }
            System.out.println();
        }
    }
    private static void printDecider(int j){
        if(j==0){
            System.out.print("* ");
        }else{
            System.out.print(j+" ");
        }
    }


}
