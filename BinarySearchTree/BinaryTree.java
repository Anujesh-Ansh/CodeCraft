package BinarySearchTree;

public class BinaryTree {
    int val;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int val) {
        this.val = val;
    }
}

class Solution {
    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(BinaryTree root) {
        maxPathSumHelper(root);
        return maxSum;
    }

    private int maxPathSumHelper(BinaryTree node) {
        if (node == null) {
            return 0;
        }
    
        int leftSum = Math.max(maxPathSumHelper(node.left), 0);
        int rightSum = Math.max(maxPathSumHelper(node.right), 0);
    
        int currentSum = node.val + leftSum + rightSum;
        maxSum = Math.max(maxSum, currentSum);
    
        return node.val + Math.max(leftSum, rightSum);
    }

    public static void main(String[] args) {
        BinaryTree root = new BinaryTree(9);
        root.left = new BinaryTree(-10);
        root.right = new BinaryTree(20);
        root.right.left = new BinaryTree(15);
        root.right.right = new BinaryTree(7);

        Solution solution = new Solution();
        int maxPathSum = solution.maxPathSum(root);
        System.out.println(maxPathSum); // Output: 44
    }
}


/*
 * A path in a binary tree is a sequence of the nodes where each pair of
 * adjacent nodes in the sequence has an edge connecting them. A path can be of
 * any length and must be contained within a single tree. The path does not need
 * to pass through the root. The path sum of a path is the sum of the node
 * values in the path. Given the root of a binary tree, return the maximum path
 * sum of any path.
 * 
 * Sample input:
 * [9,-10,20,15,7]
 * 
 * Sample Output:
 * 44
 */