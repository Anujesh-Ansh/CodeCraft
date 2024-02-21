/*
 * Search node in this BST

 * Given a BST, the task is to search a node in this BST.

 * Input
 * 3 10 20 30 10

 * Output
 * 10 found
 */


package PracticeQuestions;
import java.util.*;

public class SearchBST {
    static class Node {
        int data;
        Node left, right;

        public Node(int item) {
            data = item;
            left = right = null;
        }
    }

    static Node root;

    public static void insert(int data) {
        root = insertRec(root, data);
    }

    public static Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    public static boolean search(Node root, int data) {
        if (root == null || root.data == data)
            return true;

        if (data < root.data)
            return search(root.left, data);

        return search(root.right, data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt();

        for (int i : arr) {
            insert(i);
        }

        if (search(root, x))
            System.out.println(x + " found");
        else
            System.out.println(x + " not found");

        sc.close();
    }
}