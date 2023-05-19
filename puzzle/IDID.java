package puzzle;

import java.util.Stack;

public class IDID {
    public static void main(String[] args) {
        IDID id=new IDID();
        System.out.println(id.solve("IIDDIDID"));
    }
    private String solve(String str){
        String result="";
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<=str.length();i++){
            stack.push(i+1);
            if(i==str.length() || str.charAt(i)=='I' ){
                while(stack.size()!=0){
                    result+=stack.pop();
                }
            }
        }
        return result;
    }
}
