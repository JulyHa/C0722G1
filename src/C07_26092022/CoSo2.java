package C07_26092022;

import java.util.Stack;

public class CoSo2 {
    public static void main(String[] args) {
        int soBiChia = 10;
        Stack<Integer> stack = new Stack<>();
        while(soBiChia > 0){
            int du = soBiChia % 2;
            stack.add(du);
            soBiChia = soBiChia / 2;
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
