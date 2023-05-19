package puzzle;

public class PROGRAM {
    public static void main(String[] args) {
        print("PROGRAM");
    }
    static void print(String str){
        int start=str.length()/2;
        for(int i=0;i<str.length();i++){
            for(int space=i*2;space<2*str.length()-1;space++){
                System.out.print(" ");
            }
            for(int j = 0, end = 0; j<=i; j++){
                if(start +j<str.length()) {
                    System.out.print(str.charAt(start +j));
                }else{
                    System.out.print(str.charAt(end++));
                }
            }
            System.out.println();
        }
    }
}
