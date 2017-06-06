package leetcode.Amazon;

/**
 * Created by ARPITHA RAO on 04-06-2017.
 */
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    public TreeNode(int data){
        this.data = data;
    }
}
public class StringFromBinaryTree {


    public String convertTreeToString(TreeNode t) {
        if(t == null) return "";
        StringBuilder string = new StringBuilder();
        convertTreeToString(t, string);
        return string.toString().substring(1,string.toString().length()-1);
    }

    public void convertTreeToString(TreeNode t, StringBuilder string){
        if(t == null) return;
        string.append("(");
        string.append(t.data);
        convertTreeToString(t.left, string);
        convertTreeToString(t.right, string);
        string.append(")");
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);

        StringFromBinaryTree sb = new StringFromBinaryTree();

        String result = sb.convertTreeToString(root);

        System.out.println("Resultant String is: "+result);

    }

}
