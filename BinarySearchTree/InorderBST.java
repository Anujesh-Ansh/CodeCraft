package BinarySearchTree;

public class InorderBST {
    public static class Node {
        int key;
        Node left, right;

        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    public InorderBST() {
        root = null;
    }

    public void printInorder(Node node, int min, int max) {
        if (node == null) {
            return;
        }

        printInorder(node.left, min, max);

        if (node.key >= min && node.key <= max) {
            System.out.print(node.key + " ");
        }

        printInorder(node.right, min, max);
    }

    public static void main(String[] args) {
        InorderBST tree = new InorderBST();
        tree.root = new Node(6);
        tree.root.left = new Node(-13);
        tree.root.right = new Node(14);
        tree.root.left.right = new Node(-8);
        tree.root.right.left = new Node(13);
        tree.root.right.right = new Node(15);
        tree.root.right.left.left = new Node(7);

        int min = -10;
        int max = 13;

        System.out.println("Inorder traversal before removing keys outside the range [" + min + ", " + max + "]:");
        tree.printInorder(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);

        removeKeysOutsideRange(tree.root, min, max);

        System.out.println("\nInorder traversal after removing keys outside the range [" + min + ", " + max + "]:");
        tree.printInorder(tree.root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static Node removeKeysOutsideRange(Node node, int min, int max) {
        if (node == null) {
            return null;
        }

        node.left = removeKeysOutsideRange(node.left, min, max);
        node.right = removeKeysOutsideRange(node.right, min, max);

        if (node.key < min) {
            return node.right;
        }

        if (node.key > max) {
            return node.left;
        }

        return node;
    }
}
