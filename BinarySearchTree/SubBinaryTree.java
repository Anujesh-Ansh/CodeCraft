// Given 2 binary search tree, find if one of the tree is a subtree of the other tree.


package BinarySearchTree;

public class SubBinaryTree {
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if (s == null) {
            return false; // Corrected: Return false if s is null
        }
        if (t == null) {
            return true;
        }
        if (isSameTree(s, t)) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t); // Corrected: Recursively check left and right subtrees of s
    }

    private static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val != q.val) {
            return false;
        }
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }

    public static void main(String[] args) {
        // Test case
        TreeNode s = new TreeNode(5);
        s.left = new TreeNode(3);
        s.right = new TreeNode(7);
        s.left.left = new TreeNode(1);
        s.left.right = new TreeNode(4);
        s.right.left = new TreeNode(6);
        s.right.right = new TreeNode(8);

        TreeNode t = new TreeNode(3);
        t.left = new TreeNode(1);
        t.right = new TreeNode(4);

        System.out.println(isSubtree(s, t)); // Output: true
    }

    
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}




