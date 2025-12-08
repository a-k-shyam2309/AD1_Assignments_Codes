public class Q5 {

    // Define the Node class
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    // Define the DoublyLinkedList class
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
            newNode.prev = current;  // Set the previous pointer of the new node
        }

        // Method to print the list
        public void printList() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " ");
                current = current.next;
            }
            System.out.println();
        }

        // Method to reverse the Doubly Linked List iteratively
        public void reverse() {
            if (head == null) return;  // No need to reverse if the list is empty

            Node current = head;
            Node temp = null;

            // Traverse the list and swap next and prev pointers
            while (current != null) {
                // Swap the next and prev pointers
                temp = current.next;
                current.next = current.prev;
                current.prev = temp;

                // Move to the next node in the original list
                current = current.prev;
            }

            // After the loop, current is null, and temp points to the new head
            // Set the head to the last node (which was the tail before)
            if (temp != null) {
                head = temp.prev;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the doubly linked list
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original List:");
        list.printList();  // Print the original list

        // Reverse the list
        list.reverse();

        System.out.println("Reversed List:");
        list.printList();  // Print the reversed list
    }
}
