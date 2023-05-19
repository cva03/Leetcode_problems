package recursion;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(4,0);
    }

    private static void pattern(int r, int c){
        if(r==0){
            return;
        }
        if(c<r){
            System.out.print("* ");
            pattern(r,c+1);
        }else{
            System.out.println();
            pattern(r-1,0);
        }
    }

    private static void pattern2(int r, int c){
        if(r==1 && c==1){
            return;
        }
        if(c<r){
            pattern2(r,c+1);
            System.out.print("* ");
        }else{
            pattern2(r-1,0);
            System.out.println();
        }
    }
}
