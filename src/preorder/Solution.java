package preorder;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class Solution {
    //traversal pre-order traversal

    public static void main(String[] args) {
        TreeNode lNode = new TreeNode(3,null,null);
        TreeNode rNode = new TreeNode(2,lNode,null);
        TreeNode root = new TreeNode(1,null,rNode);

        System.out.println(preorderTraversal(root));
    }

    //without recursion
     public static List<Integer> preorderTraversal(TreeNode root) {
         List<Integer> result = new ArrayList<>();
         Stack<TreeNode> stack =  new Stack<>();

         if (root == null) {
             return result;
         }

         stack.push(root);
         while(!stack.empty()) {
             TreeNode node = stack.pop();
             result.add(node.val);

             if (node.right != null) {
                 stack.push(node.right);
             }

             if (node.left != null) {
                 stack.push(node.left);
             }
         }
         return result;
     }

    //recursion
//    List<Integer> result = new ArrayList<>();
//    public static List<Integer> preorderTraversal(preorder.TreeNode root){
//
//        if(root == null) return result;
//            if(root!=null) result.add(root.val);
//            if(root.left != null) preorderTraversal(root.left);
//            if(root.right != null) preorderTraversal(root.right);
//        return result;
//    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
