public class Q4 {

    // Define the Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Define the LinkedList class
    static class LinkedList {
        Node head;

        // Constructor
        public LinkedList() {
            head = null;
        }

        // Method to add a node at the end of the list
        public void append(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Recursive method to print the linked list in reverse
        public void printReverse(Node node) {
            if (node == null) {
                return;
            }
            // First recurse to the next node
            printReverse(node.next);
            // Then print the data after recursion unwinds
            System.out.print(node.data + " ");
        }

        // Wrapper method for printReverse
        public void printReverse() {
            printReverse(head);
            System.out.println(); // To move to a new line after printing
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Linked List in Reverse Order:");
        list.printReverse();  // Print the list in reverse order
    }
}
