/*
package GeeksForGeeks;

import DataStructures.BinaryTree;

*/
/**
 * Created by ARPITHA RAO on 20-03-2017.
 *//*

public class SortedListToBST {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static BinaryTree.TreeNode listToTree(Node node){

        if(node == null) return null;
        if(node.next == null) return new BinaryTree.TreeNode(node.data);
        Node mid = findMidElement(node);
        Node midNext = mid.next;
        mid.next = null;

        BinaryTree.TreeNode root = new BinaryTree.TreeNode(mid.data);
        root.left = listToTree(node);
        root.right = listToTree(midNext);

        return root;
    }

    public static Node findMidElement(Node node){

        if(node == null) return null;
        if(node.next == null) return node;

        Node fast = node;
        Node slow = node;

        while(fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        return slow;

    }

    public static void main(String args[]){

    }

}
*/
