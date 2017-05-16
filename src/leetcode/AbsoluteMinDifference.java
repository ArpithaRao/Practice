package leetcode;

import java.util.ArrayList;

/**
 * Created by ARPITHA RAO on 15-05-2017.
 */
public class AbsoluteMinDifference {

    ArrayList<Integer> result = new ArrayList<>();
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
        }
    }
    public void inOrderRecursive(TreeNode root){
        if(root == null) return;
        inOrderRecursive(root.left);
        result.add(root.val);
        inOrderRecursive(root.right);
    }

    public int getMinimumDifference(TreeNode root) {
        inOrderRecursive(root);
        System.out.println("Result array");
        System.out.println(result);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < result.size()-1; i++){
            if(min > Math.abs(result.get(i)-result.get(i+1))){
                min =  Math.abs(result.get(i)-result.get(i+1));
            }
        }
        return min;
    }

    public static void main(String[] args){
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(6);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(18);

        AbsoluteMinDifference a = new AbsoluteMinDifference();
        int diff = a.getMinimumDifference(root);
        System.out.println(diff);

    }

}
