package HackerRank;

/**
 * Created by ARPITHA RAO on 02-02-2017.
 */
public class IsBST {

    class TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        void TreeNode(int value){
            value = this.value;
        }
    }

    private static boolean isBst(TreeNode treeNode1){
        if(treeNode1 == null) return false;
        if(treeNode1.value > treeNode1.left.value && treeNode1.value > treeNode1.right.value)
        {


        }

            return true;

    }

}
