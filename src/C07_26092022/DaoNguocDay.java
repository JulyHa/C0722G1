package C07_26092022;

import java.util.Stack;

public class DaoNguocDay {
    public static void main(String[] args) {
        int arr[] = {1,5,2,5,7,8};
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<arr.length; i++){
            stack.add(arr[i]);
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
