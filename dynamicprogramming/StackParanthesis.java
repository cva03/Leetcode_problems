package dynamicprogramming;

import java.util.HashMap;
import java.util.Stack;

public class StackParanthesis {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        HashMap<Character,Character> map=new HashMap<>(){
            {
                put('}','{');
                put(']','[');
                put(')','(');
            }
        };

        for(char ch:s.toLowerCase().toCharArray()){
            if(map.containsKey(ch)){
                if(st.peek()==map.get(ch)){
                    st.pop();
                }else{
                    return false;
                }

            }else{
                st.push(ch);
            }
        }
        return st.isEmpty();
    }
}
