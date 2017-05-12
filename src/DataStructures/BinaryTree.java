package DataStructures;

import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 21-04-2017.
 */
public class BinaryTree {

    int data;

    static class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
        }
    }

    class Node{
        int i = 0;
        public Node(int i) {
           this.i = i;
        }
        public void print(){
            System.out.println(data);
        }
    }

    //DFS tree traversals recursive
    public void inOrderRecursive(TreeNode root){
        if(root == null) return;
        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }

    public void preOrderRecursive(TreeNode root){
        if(root == null) return;
        System.out.print(root.data + " ");
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public void postOrderRecursive(TreeNode root){
        if(root == null) return;
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data + " ");
    }

    //BFS of the Tree
    public void levelOrderTraversal(TreeNode root){
        int height = height(root);
        for(int i = 0; i <=height; i++){
            System.out.println();
            printNodesInLevel(root,i);
        }
    }

    public void printNodesInLevel(TreeNode root, int level){
        if(level == 0) return;
        if(level == 1){
            System.out.print(root.data + " ");
        }
        printNodesInLevel(root.left, level - 1);
        printNodesInLevel(root.right, level - 1);
    }

    public boolean isTreeBalanced(TreeNode root){
        if(root == null) return true;
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if(Math.abs(leftHeight - rightHeight)<=1
                && isTreeBalanced(root.left)
                && isTreeBalanced(root.right)){
            return true;
        }
        return false;
    }

    public int height(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(height(root.left),height(root.right));
    }

    private int min = Integer.MAX_VALUE;
    //find second minimum in tournament tree
    public int findSecondMinimum(TreeNode node){
        if(node == null) return 0;
        findSecondMinimum(node.left);
        findSecondMinimum(node.right);
        int tempMin = Integer.MAX_VALUE;
        if(node.left != null && node.right!=null) {
            if (node.left.data == node.data) tempMin = node.right.data;
            else tempMin = node.left.data;
        }
        if(min > tempMin) {
            min = tempMin;
        }
        return min;
    }

    //Lowest Common Ancestor in Binary Search Tree
    public TreeNode LCA(TreeNode root, int num1, int num2){
        if(root == null) return null;
        if(root.data < num1 && root.data < num2) {
           return LCA(root.right, num1, num2);
        }
        if(root.data > num1 && root.data > num2) {
            return LCA(root.left, num1, num2);
        }
        return root;
    }

   /* public TreeNode invertTree(TreeNode node){

        TreeNode current = node;
        Stack<TreeNode> stack = new Stack<>();


    }*/


    public ArrayList<ArrayList<Integer>> printAllPathsofTree(TreeNode node, ArrayList<Integer> current, ArrayList<ArrayList<Integer>> result ){
        if(node == null) return null;
        current.add(node.data);
        if(node.left == null && node.right == null){
            result.add(current);
        }
        if(node.left!=null){
            ArrayList<Integer> temp = new ArrayList<>(current);
            printAllPathsofTree(node.left, temp, result);
        }

        if(node.right!=null){
            ArrayList<Integer> temp = new ArrayList<>(current);
            printAllPathsofTree(node.right, temp, result);
        }
        return result;
    }

    //wrapper function for printing paths
    public void printAllPaths(TreeNode root){
        ArrayList<Integer> path = new ArrayList<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        System.out.println(printAllPathsofTree(root, path, result));
    }

    private int thisLevelLeft = 0;
    public void leftViewOfTree(TreeNode node, int level){
        if(node == null) return;
        if(thisLevelLeft <level){
            System.out.print(node.data+" ");
            thisLevelLeft = level;
        }
        leftViewOfTree(node.left,level+1);
        leftViewOfTree(node.right,level+1);
    }

    private int thisLevelRight = 0;
    public void rightViewOfTree(TreeNode node, int level){
        if(node == null) return;
        if(thisLevelRight < level){
            System.out.print(node.data+" ");
            thisLevelRight = level;
        }
        rightViewOfTree(node.right,level+1);
        rightViewOfTree(node.left,level+1);
    }

    public TreeNode mirrorOfTree(TreeNode node){
        if(node == null) return null;
        TreeNode root = node;
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        mirrorOfTree(node.left);
        mirrorOfTree(node.right);
        return root;
    }

    public static void main(String args[]){
        BinaryTree tree = new BinaryTree();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        //test if tree is balanced in height
        System.out.println(tree.isTreeBalanced(root));

        //test to find LCA of the given numbers
        TreeNode lca = tree.LCA(root,36,42);
        if(lca == null) {
            System.out.println("no lca");
        }
        else {
            System.out.println(lca.data);
        }

        System.out.println();
        System.out.println("inOrder recursive tree traversal");
        //test inOrder recursive tree traversal
        tree.inOrderRecursive(root);

        System.out.println();
        System.out.println("preOrder recursive tree traversal");
        //test preOrder recursive tree traversal
        tree.preOrderRecursive(root);

        System.out.println();
        System.out.println("postOrder recursive tree traversal");
        //test postOrder recursive tree traversal
        tree.postOrderRecursive(root);

        System.out.println();
        System.out.println("levelOrder tree traversal");
        //test level Order tree traversal
        tree.levelOrderTraversal(root);

        TreeNode root2 = new TreeNode(4);
        root2.left = new TreeNode(4);
        root2.right = new TreeNode(6);
        root2.left.left = new TreeNode(4);
        root2.left.right = new TreeNode(5);
        root2.right.left = new TreeNode(6);
        root2.right.right = new TreeNode(7);

        System.out.println();
        System.out.println("Second min value in a tournament tree "+ tree.findSecondMinimum(root2));

        System.out.println();
        System.out.println("left view of binary tree ");
        tree.leftViewOfTree(root, 3);

        System.out.println();
        System.out.println("right view of binary tree ");
        tree.rightViewOfTree(root, 3);

        System.out.println();
        System.out.println("mirror of binary tree ");
        tree.levelOrderTraversal(tree.mirrorOfTree(root));

        System.out.println();
        System.out.println("print all paths of binary tree ");
        tree.printAllPaths(root);

        //testing inner class object creation
        BinaryTree bt = new BinaryTree();
        BinaryTree.Node innerClass = bt.new Node(7);
        innerClass.print();
    }

}
