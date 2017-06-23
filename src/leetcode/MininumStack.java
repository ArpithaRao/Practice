package leetcode;

import java.util.Stack;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class MininumStack {

    Stack<Integer> stack = new Stack<>();
    int min = Integer.MAX_VALUE;

    public void push(int x) {
        if(x < min){
            min = x;
            stack.push(min);
        }
        stack.push(x);
    }

    public void pop() {
        // if pop operation could result in the changing of the current minimum value,
        // pop twice and change the current minimum value to the last minimum value.
        if(stack.pop() == min) min=stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return min;
    }

    public static void main(String args[]){
        MininumStack ms = new MininumStack();
        ms.push(5);
        ms.push(4);
        ms.push(3);

        System.out.println(ms.stack);
        System.out.println("min " + ms.getMin());

        ms.pop();

        ms.push(5);
        ms.push(4);
        ms.push(2);

        ms.pop();

        System.out.println(ms.stack);
        System.out.println("top "+ms.top());
        System.out.println("min " + ms.getMin());
    }
}
