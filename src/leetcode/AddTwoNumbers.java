package leetcode;

/**
 * Created by ARPITHA RAO on 07-03-2017.
 */


public class AddTwoNumbers {

    public static class ListNode{
        int value;
        ListNode next;
        ListNode(int value){
            this.value = value;
        }
    }

    /*public static ListNode addNumbers(ListNode l1, ListNode l2){
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while(l1!=null){
            s1.push(l1.value);
            l1 = l1.next;
        }

        while(l2!=null){
            s2.push(l2.value);
            l2 = l2.next;
        }

        int sum = 0;

        ListNode answer = new ListNode(0);
        while(!s1.empty() || !s2.empty()){
            if(!s1.empty()) sum += s1.pop();
            if(!s2.empty()) sum += s2.pop();

            answer.value = sum%10;
            ListNode newHead = new ListNode(sum/10);
            newHead.next = answer;
            answer = newHead;
            sum /= 10;

        }

        return answer.value==0?answer.next:answer;

    }*/

    public static ListNode addNumbers(ListNode l1, ListNode l2){
        if(l1 == null && l2 == null) return null;
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        int carry = 0;
        int sum = 0;

        ListNode result = new ListNode(0);
        ListNode temp = result;

        while(l1 != null || l2 != null){

            if(l1 == null){
                carry = (l2.value) / 10;
                sum = ( l2.value + carry) % 10;
            }

            else if(l2 == null){
                carry = (l1.value ) / 10;
                sum = ( l1.value + carry) % 10;
            }
            else {

                sum = (l1.value + l2.value + carry) % 10;
                carry = (l1.value + l2.value) / 10;
            }

            ListNode newNode = new ListNode(sum);
            result.next = newNode;
            result = result.next;
            if (l2!=null) l2 = l2.next;
            if (l1!=null) l1= l1.next;
        }

        return temp.next;

    }

    public static void printList(ListNode node){
        if(node == null) return;
        while (node!=null){
            System.out.print(" "+node.value);
            node = node.next;
        }
    }

    public static void main(String args[]){
        ListNode l1 = new ListNode(7);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);
        l1.next.next.next = new ListNode(3);

        printList(l1);

        System.out.println();

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        printList(l2);

        System.out.println();

        printList(addNumbers(l1, l2));
    }


}
