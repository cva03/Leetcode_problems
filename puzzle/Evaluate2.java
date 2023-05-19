package puzzle;

import java.util.Stack;

public class Evaluate2 {
    public static void main(String[] args) {
        System.out.println(evaluate("545*+5/"));
    }
    static int evaluate(String str){
        Stack<Integer> stack=new Stack<>();
        char[] chars=str.toCharArray();
        for(char ch:chars){
            if(Character.isDigit(ch)){
                stack.push(ch-'0');
            }else{
                int a=stack.pop();
                int b=stack.pop();
                switch (ch){
                    case '+':
                        stack.push(a+b);
                        break;
                    case '-':
                        stack.push(b-a);
                        break;
                    case '*':
                        stack.push(a*b);
                        break;
                    case '/':
                        stack.push(b/a);
                        break;
                }
            }
        }
        return stack.pop();
    }

}
