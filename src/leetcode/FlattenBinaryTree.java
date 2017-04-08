/*
package leetcode;

*/
/**
 * Created by ARPITHA RAO on 10-02-2017.
 *//*

public class FlattenBinaryTree {

    static class TreeNode{
        TreeNode left = null;
        TreeNode right = null;
        int value;
        TreeNode(int value){
            this.value = value;
        }
    }

    public static void Print(TreeNode root){

       if(root!= null){
            System.out.print(root.value + " ");
            Print(root.left);
            Print(root.right);

        }
    }



    public static void flatten(TreeNode root){

        if(root == null) return;

        TreeNode initialRoot = root;


            TreeNode temp = root.right;
            root.right = root.left;



            root.left = null;
            root.left.right.right = temp;

            flatten(root.right);
        }
    }

    public static void main(String args[]){
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(5);
        node.right.right = new TreeNode(6);

   */
/*     //print the original tree
        Print(node);

        System.out.println("\n");*//*


        //test flatten
        Print(flatten(node));
    }

}
*/
