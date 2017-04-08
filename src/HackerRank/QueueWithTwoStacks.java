package HackerRank;

import java.util.NoSuchElementException;
import java.util.Stack;

/**
 * Created by ARPITHA RAO on 18-01-2017.
 */

public class QueueWithTwoStacks<Item> {

    private Stack<Item> stack1 = null; // back of the queue
    private Stack<Item> stack2 = null; // front of the queue


    //create empty queue
    public QueueWithTwoStacks(){
        stack1 = new Stack<Item>();
        stack2 = new Stack<Item>();
    }

    //move all items from stack1 to stack2
    public void moveStack1ToStack2(){
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
    }

    //if queue is empty
    public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
    }

    //return the number of items in the queue
    public int size(){
        return stack1.size() + stack2.size();
    }

    //return the item least recently added to the queue
    public Item peek(){
        if(isEmpty()) throw new NoSuchElementException("Queue underflow");

        if(stack2.isEmpty()){
            moveStack1ToStack2();
        }
        return stack2.peek();
    }

    //add item to the queue
    public void enqueue(Item item){
        stack1.push(item);
    }

    //remove and return the least recently added item to the queue
    public Item dequeue(){
        if(isEmpty()) throw new NoSuchElementException("Queue underflow");
        if(stack2.isEmpty()){
            moveStack1ToStack2();
        }
        return stack2.pop();
    }

    public static void main(String args[]){

        QueueWithTwoStacks<String> queueWithTwoStacks = new QueueWithTwoStacks<String>();

        queueWithTwoStacks.enqueue("1");
        queueWithTwoStacks.enqueue("2");
        queueWithTwoStacks.enqueue("3");
        System.out.println(queueWithTwoStacks.size());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.dequeue());
        System.out.println(queueWithTwoStacks.peek());
        System.out.println(queueWithTwoStacks.size());

    }

}

