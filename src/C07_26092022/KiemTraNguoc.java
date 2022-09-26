package C07_26092022;

import java.util.Stack;

public class KiemTraNguoc {
    public static void main(String[] args) {
        String s = "(()(()))())";
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                stack.add(s.charAt(i));
            }
            else {
                if(stack.isEmpty()){
                    System.out.println("Biểu thức sai");
                    return;
                }
                else {
                    stack.pop();
                }
            }
        }
        if(stack.isEmpty()) System.out.println("Biểu thức đúng");
        else System.out.println("Biểu thức sai");
    }
}
