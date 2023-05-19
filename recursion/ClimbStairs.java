package recursion;

public class ClimbStairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }
    public static int climbStairs(int n) {
        int count=0;
        if(n<=0){
            if(n==0)
                return 1;
            return 0;
        }
        count=count+climbStairs(n-1);
        count=count+climbStairs(n-2);
        return count;
    }
}
