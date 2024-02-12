package DataStructures.LinkedList;

class ReverseLinkedList {

    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
	Node head; 
    Node tail;

	public void push(int new_data)
	{
		Node new_node = new Node(new_data);
        new_node.next = null;
        if(head==null){
            head = new_node;
            tail = new_node;
            head.next=tail;
            
        }
        tail.next=new_node;
		tail = new_node;
	}

    public void pull(int d){
        if(head==null){
            System.out.println("List is empty");
        }
        else{
            Node prev = head;
            Node current = head.next;

            if(prev.data == d){
                head = head.next;
            }
            else{
                while(prev.next!=null){
                    if(current.data == d){
                        prev.next = current.next;
                    }
                    prev = current;
                    current = current.next;
                }
            }
        }
    }

	public void printList()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        ReverseLinkedList llist = new ReverseLinkedList();
        llist.push(1);
        llist.push(2);
        llist.push(3);
        llist.push(4);
        llist.push(5);


        System.out.println("Linked List elements are:");
        llist.printList();

        llist.reverse(3);

        System.out.println("Linked List elements are:");
        llist.printList();
    }

    public void reverse(int n) {
        Node prev = null;
        Node current = head;
        Node nextNode = null;
        Node temp = head;
        int i=1;
        while(i<n){
            temp=current;
            current=current.next;
            temp.next=current;
            i++;
        }
        if(i==n){
            while (current!=null){
                if(current.next==null){
                    nextNode=null;
                }else{
                    nextNode=current.next;
                }
                current.next=prev;
                prev=current;
                current=nextNode;
                
            }
            temp.next=prev;
        }
        

        
    }
}
