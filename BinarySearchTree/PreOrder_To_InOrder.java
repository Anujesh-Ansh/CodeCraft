package BinarySearchTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PreOrder_To_InOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the pre-order tree: ");
        int n = scanner.nextInt();
        int[] preOrder = new int[n];
        System.out.println("Enter the elements of the pre-order tree:");
        for (int i = 0; i < n; i++) {
            preOrder[i] = scanner.nextInt();
        }
        scanner.close();

        List<Integer> inOrder = preOrderToInOrder(preOrder);
        System.out.println("In-order traversal:");
        for (int value : inOrder) {
            System.out.print(value + " ");
        }
    }

    public static List<Integer> preOrderToInOrder(int[] preOrder) {
        List<Integer> inOrder = new ArrayList<>();
        if (preOrder == null || preOrder.length == 0) {
            return inOrder;
        }
        preOrderToInOrderHelper(preOrder, 0, preOrder.length - 1, inOrder);
        return inOrder;
    }

    private static void preOrderToInOrderHelper(int[] preOrder, int start, int end, List<Integer> inOrder) {
        if (start > end) {
            return;
        }
        int rootValue = preOrder[start];
        int rootIndex = start;
        while (rootIndex <= end && preOrder[rootIndex] <= rootValue) {
            rootIndex++;
        }
        preOrderToInOrderHelper(preOrder, start + 1, rootIndex - 1, inOrder);
        inOrder.add(rootValue);
        preOrderToInOrderHelper(preOrder, rootIndex, end, inOrder);
    }
}
