package DataStructures;

import java.util.ArrayList;

    /**
     * Created by ARPITHA RAO on 04-03-2017.
     */

        public class MyQueue {

            private static ArrayList<Integer> queue = new ArrayList<>();

            public static ArrayList<Integer> enqueue(int value){
                queue.add(value);
                return queue;
            }

            public static ArrayList<Integer> dequeue(){
                queue.remove(queue.get(queue.size() - 1));
                return queue;
            }

            public static int peek(){

                int lastElement = queue.get(queue.size()-1);
                return lastElement;
            }

            public static boolean isEmpty(){
                if(queue.size()>0) return false;
                return true;
            }

        /*public static ArrayList<Integer> kSum(ArrayList<Integer> list, int k){
            int sum = Integer.MIN_VALUE;
            for(int i =0; i < list.size() - k; i++ ){
                if(sum < list.get(i)+list.get(i+1)+list.get(i+2))
            }

        }*/

            public static void main(String args[]){

                System.out.println(enqueue(3));
                enqueue(4);
                enqueue(5);
                System.out.println(enqueue(6));
                System.out.println(dequeue());
                System.out.println(peek());
                System.out.println(isEmpty());

            }

        }

