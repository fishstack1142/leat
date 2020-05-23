package inorder;

import java.util.ArrayList;
import java.util.List;

class Solution {

        public static void main(String[] args) {

            TreeNode lNode = new TreeNode(3,null,null);
            TreeNode rNode = new TreeNode(2,lNode,null);
            TreeNode root = new TreeNode(1,null,rNode);

            System.out.println(inorderTraversal(root));

    }

    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        traverse(root, result);
        return result;
    }

    public static void traverse(TreeNode root, List<Integer> result) {

            if (root != null) {
                if (root != null) {
                    traverse(root.left, result);
                }

                result.add(root.val);
                if (root.right != null) {
                    traverse(root.right, result);
                }
            }

    }

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
