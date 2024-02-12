package DataStructures.LinkedList;

public class QueueDoubly {
    private Node front;
    private Node rear;

    private class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public QueueDoubly() {
        front = null;
        rear = null;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public int dequeue() {
        if (isEmpty()) {
            return -1;
        }

        int data = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        } else {
        }

        return data;
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return front.data;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        QueueDoubly queue = new QueueDoubly();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display(); // Output: 10 20 30

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: Dequeued element: 10
        System.out.println("Peeked element: " + queue.peek()); // Output: Peeked element: 20

        queue.display(); // Output: 20 30


    }
}
