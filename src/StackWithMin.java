import java.util.Stack;

/**
 * Created by ARPITHA RAO on 24-02-2016.
 */

/*This approach is using two stacks which is little more space efficient compared to one stack
 approach where 2n space is wasted since min does not change that often*/
public class StackWithMin extends Stack<Integer> {

    static Stack<Integer> s2;
    public StackWithMin(){
        s2 = new Stack<>();

    }

    public void push(int value){

        if(value<= min()){
           s2.push(value);
        }
        super.push(value);

    }
    public Integer pop(){
        int value = super.pop();
        if(value == min()) s2.pop();
     return value;
    }

    public Integer min(){
        if(!s2.isEmpty()) return s2.peek();
        return Integer.MAX_VALUE;

    }

    public static void main(String args[]){
        StackWithMin s = new StackWithMin();
        s.push(5);
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
        System.out.println(s2.peek());

    }
}

