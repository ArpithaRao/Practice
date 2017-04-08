import java.util.EmptyStackException;

/**
 * Created by ARPITHA RAO on 20-02-2016.
 */
public class StackFromArray{
    private static int top;
    private static int[] stack;

    private static void StackFromArray(int capacity){
        if(capacity<=1) throw new IllegalArgumentException("Capacity should be positive");
        stack = new int[capacity];
        top = -1;

    }

    private static void push(int element){
        if(top == stack.length) throw new StackOverflowError();
        top++;
        stack[top] = element;

    }

    private static int peek(){
        if(top == -1) throw new EmptyStackException();
        return stack[top];
    }

    private static void pop(){
        if(top == -1) throw new EmptyStackException();
        top--;
    }

//    boolean isEmpty(){
//        return top== -1;
//    }

    public static void main(String args[]){

       StackFromArray(10);
        push(10);
        push(11);
        push(12);
        push(13);
        push(14);
        push(10);
        push(11);
        push(12);
        push(13);
        push(14);
        pop();
        pop();
        pop();
        System.out.println("Peek Value "+peek());

        for(int i =0; i< top; i++)
            System.out.println(stack[i]);


    }

}
