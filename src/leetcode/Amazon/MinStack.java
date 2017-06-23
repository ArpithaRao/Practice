package leetcode.Amazon;

/**
 * Created by ARPITHA RAO on 12-06-2017.
 */
public class MinStack {

     class ListNode {
        ListNode next;
        int val;
        ListNode(int val){
            this.val = val;
        }
    }

     ListNode head;
     int min = Integer.MAX_VALUE;
     int nextMin = Integer.MAX_VALUE;

    public void push(int x) {

        if(x < min) {
            nextMin = min;
            min = x;
        }

        ListNode newHead = new ListNode(x);
        newHead.next = head;
        head = newHead;

    }

    public  void pop() {
        if(head.next == null) head = null;
        int v = head.val;
        if(v == min) {
            min = nextMin;
        }
        head = head.next;

        if(head == null) min = Integer.MAX_VALUE;
    }

    public  int top() {
        if(head==null) return 0;
        return head.val;
    }

    public  int getMin() {
        return min;
    }

    public boolean isEmpty(){
        if(head != null) return false;
        return true;
    }

    public void printStack(){
        ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }

    public static void main(String args[]){
        MinStack ms = new MinStack();
        ms.push(5);
        ms.push(4);
        ms.push(3);
        ms.push(2);
        ms.push(1);

        ms.printStack();
        System.out.println(" min " + ms.getMin());
        System.out.println("next min " + ms.nextMin);

        System.out.println("after pop ");
        ms.pop();

        ms.printStack();

        System.out.println(" min " + ms.getMin());
        System.out.println("next min " + ms.nextMin);

        System.out.println(" top "+ms.top());

    }

}
