package BinarySearchTree;
public class BinarySearchTree {

    private static class Node {
        private int value;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        root = insertNode(root, value);
    }

    private Node insertNode(Node node, int value) {
        if (node == null) {
            return new Node(value);
        }

        if (value < node.value) {
            node.left = insertNode(node.left, value);
        } else if (value > node.value) {
            node.right = insertNode(node.right, value);
        }

        return node;
    }

    public int findKthSmallest(int k) {
        
        if (k < 1 || k > countNodes(root)) {
            return -1; // Return -1 if k is out of range
        }
        Node node = findKthSmallest(root, k);
        return node.value;
    }

    private Node findKthSmallest(Node node, int k) {
        if (node == null) {
            return null;
        }

        int leftCount = countNodes(node.left);
        if (leftCount == k - 1) {
            return node;
        } else if (leftCount >= k) {
            return findKthSmallest(node.left, k);
        } else {
            return findKthSmallest(node.right, k - leftCount - 1);
        }
    }

    private int countNodes(Node node) {
        if (node == null) {
            return 0;
        }
        return 1 + countNodes(node.left) + countNodes(node.right);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        int[] values = {4, 2, 7, 1, 3, 6, 9};
        for (int value : values) {
            bst.insert(value);
        }
        
        int k = 3;
        int kthSmallest = bst.findKthSmallest(k);
        System.out.println("The " + k + "th smallest value is: " + kthSmallest);
    }
}




/*
 * GIven an array, and an integer k, return the kth smallest value using binary search tree

Sample Input:-
[4,2,7,1,3,6,9]
3

Sample Output:-
3
 */