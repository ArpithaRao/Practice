import java.util.EmptyStackException;

/**
 * Created by ARPITHA RAO on 06-03-2016.
 */
public class MyStack<T> {
private static class MyStackNode<T> {
    private T value;
    MyStackNode<T> next;

    MyStackNode(T value) {
        this.value = value;
    }
}
    private MyStackNode<T> top;
    public void push(T value){
        MyStackNode<T> t = new MyStackNode<>(value);
        t.next = top;
        top = t;
    }

    public T pop(){
        if(top == null) throw new EmptyStackException();
        T item = top.value;
        top = top.next;
        return item;
    }

    public T peek(){
        if(top == null) throw new EmptyStackException();
        return top.value;
    }

    public boolean isEmpty(){
        return top == null;
    }

    public static void main(String args[]){
        MyStack<Integer> s = new MyStack();

        s.push(5);
        System.out.println(s);
        s.push(3);
        s.push(15);
        s.push(25);
        s.push(18);
        s.push(1);
        s.pop();
        s.push(42);
        s.push(45);
        s.push(15);
        s.push(5);
        s.push(50);
        s.pop();
        System.out.println(s);
        System.out.println(s.peek());
        System.out.println(s.isEmpty());

    }
}
