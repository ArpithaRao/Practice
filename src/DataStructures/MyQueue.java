package DataStructures;

import java.util.NoSuchElementException;

/**
     * Created by ARPITHA RAO on 04-03-2017.
     */


public class MyQueue {

            class ListNode {
                int data;
                ListNode next;
                ListNode(int data){
                    this.data = data;
                }
            }


    private ListNode first;
    private ListNode last;

    public ListNode enqueue(int data){
        ListNode oldLast = last;
        ListNode newLast = new ListNode(data);
        newLast.next = oldLast;
        last = newLast;

        return last;
    }

    public int poll(){
        if(last == null) return 0;
        ListNode temp = last;
        int value = 0;
        while (temp.next!=null){
            temp = temp.next;
            value = temp.next.data;
            if(temp.next.next == null)temp.next = null;
        }

        first = temp;
        return value;
    }

    public int peek(){
        if(last == null) throw new NoSuchElementException();
        return last.data;
    }

    public boolean isEmpty(){
        if(last == null){
            return true;
        }
        return false;
    }

    public void printQueue(){
        ListNode node = last;
        while(node!=null){
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String args[]){
        MyQueue mq = new MyQueue();
        mq.enqueue(1);
        mq.enqueue(2);
        mq.enqueue(3);
        mq.enqueue(4);
        mq.enqueue(5);
        mq.printQueue();

//        System.out.println(mq.last.data);

        System.out.println("Poll");
        System.out.println(mq.poll());

        System.out.println(mq.peek());

        System.out.println(mq.isEmpty());

    }



}

