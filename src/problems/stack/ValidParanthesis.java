package problems.stack;

import java.util.Stack;

public class ValidParanthesis {

    public boolean isValidParanthesis(String s) {
        Stack<Character> st = new Stack<>();
        for(Character c :  s.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if(st.isEmpty()) {
                    return false;
                }
                Character top  = st.pop();
                if( c == ')' && top != '(' ) {
                    return false;
                }
                if( c == '}' && top != '{' ) {
                    return false;
                }
                if( c == ']' && top != '[' ) {
                    return false;
                }
            }
        }
        return  st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        System.out.println(vp.isValidParanthesis("({[]})"));
        System.out.println(vp.isValidParanthesis("({[})"));
    }

}
