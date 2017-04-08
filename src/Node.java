/**
 * Created by ARPITHA RAO on 24-01-2016.
 */
public class Node {
    private Node next;
    private String data;

    public Node(Node next, String data) {
        this.data = data;
        this.next = next;
    }

    public String getData() {
       return data;
    }

    public Node getNext() {
        return next;
    }

    public void setData(String d) {
        data = d;
    }

    public void setNext(Node n) {
        next = n;
    }

    String InsertFront(Node head){
        if(head == null){
            Node infront = new Node(next, "1");
         }
        else {
            Node infront = new Node(next, "1");
            infront.setNext(head);
            head = infront;
        }
        return head.getData();

    }
  void Print(Node head) {

        String result  = null;

        while(head.getNext()!= null){
            head = head.getNext();
            result += (head.getData()+ ", ");
        }
        System.out.println(result);
    }
}
