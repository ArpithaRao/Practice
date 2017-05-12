package DataStructures;

/**
 * Created by ARPITHA RAO on 20-04-2017.
 */
public class LinkedListClass {

    static class ListNode{
        ListNode next;
        int data;
        ListNode(int data){
            this.data = data;
        }
    }

    public ListNode reverseList(ListNode head){
        if(head == null) return null;// null list
        if(head.next == null) return head;// one element in the list
        ListNode secondNode = head.next;
        head.next = null;// delink the second and first element

        ListNode reverseNode = reverseList(secondNode);

        secondNode.next = head;//relink for reversal:)

        return reverseNode;

    }

    public ListNode findStartOfLoop(ListNode node){
        ListNode fast = node;
        ListNode slow = node;

        while ( slow!=null && fast != null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow){
               return slow;
            }
        }

        return null;
    }

    /*public ListNode reverseKElements(ListNode head, int k){
        if(head == null) return null;
        if(head.next == null) return head;
        ListNode temp = head;
        int count = 0;
        while(count<=k && temp.next!=null){
            temp = temp.next;
        }


        ListNode temp1 = temp.next;
        temp.next = null;


        ListNode reverse = reverseList(temp);
        ListNode secondRev = reverse;
        while(secondRev.next!=null){
            secondRev = secondRev.next;
        }
        secondRev.next = temp1;
        return secondRev;

    }*/

    public void printReverseList(ListNode head){

        if(head == null) return;
        ListNode node = head;
        printReverseList(node.next);
        System.out.print(node.data + " ");
    }

    public void printList(ListNode head){
        while(head!=null){
            System.out.print(head.data+" ");
            head = head.next;
        }
    }

    public static void main(String args[]){
       /* ListNode node = new ListNode(5);
        ListNode node1 = new ListNode(6);
        node.next = node1;
        ListNode node2 = new ListNode(7);
        node1.next = node2;
        ListNode node3 = new ListNode(8);
        node2.next = node3;
        ListNode node4 = new ListNode(9);
        node3.next = node4;
        ListNode node5 = new ListNode(10);
        node4.next = node5;
        ListNode node6 = new ListNode(11);
        node5.next = node6;
        ListNode node7 = new ListNode(12);
        node6.next = node7;
        ListNode node8 = new ListNode(13);
        node7.next = node8;
        ListNode node9 = new ListNode(14);
        node8.next = node9;
        ListNode node10 = new ListNode(15);
        node9.next = node10;
        ListNode node11 = new ListNode(16);
        node10.next = node11;
        ListNode node12 = new ListNode(16);
        node11.next = node12;
        node12.next = node7;*/

        ListNode node = new ListNode(5);
        ListNode node1 = new ListNode(6);
        node.next = node1;
        ListNode node2 = new ListNode(7);
        node1.next = node2;
        ListNode node3 = new ListNode(8);
        node2.next = node3;
        node3.next = node1;
        LinkedListClass rev = new LinkedListClass();
//        rev.printReverseList(node);
//        rev.printList(rev.reverseList(node));
//        rev.printList(rev.reverseKElements(node, 3));

        //rev.printList(node);
        System.out.println(rev.findStartOfLoop(node).data);
    }

}
