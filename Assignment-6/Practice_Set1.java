//import java.util.Scanner;
//
//class Node {
//    int data;
//    Node next;
//
//    Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//
//    // Method to display the linked list
//    public static void display(Node start) {
//        if (start == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//        Node temp = start;
//        while (temp != null) {
//            System.out.print(temp.data + " -> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    // Method to insert a node at a given position
//    public static Node insert(Node start) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Data: ");
//        int data = sc.nextInt();
//        System.out.print("Enter Position: ");
//        int position = sc.nextInt();
//
//        Node obj = new Node(data);
//        if (position == 1) {
//            obj.next = start;
//            start = obj;
//            return start;
//        } else if (position > 1) {
//            Node temp = start;
//            int i = 1;
//            while (i < position - 1 && temp != null) {
//                temp = temp.next;
//                i++;
//            }
//            if (temp != null) {
//                obj.next = temp.next;
//                temp.next = obj;
//            } else {
//                System.out.println("Invalid Position");
//            }
//            return start;
//        } else {
//            System.out.println("Invalid Position");
//            return start;
//        }
//    }
//
//    // Method to delete a node at a given position
//    public static Node delete(Node start) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Position to delete: ");
//        int position = sc.nextInt();
//
//        if (start == null) {
//            System.out.println("List is empty.");
//            return start;
//        }
//
//        if (position == 1) {
//            start = start.next; // Remove the first node
//            return start;
//        }
//
//        Node temp = start;
//        int i = 1;
//        while (i < position - 1 && temp != null) {
//            temp = temp.next;
//            i++;
//        }
//
//        if (temp != null && temp.next != null) {
//            temp.next = temp.next.next; // Remove the node at the given position
//        } else {
//            System.out.println("Invalid Position");
//        }
//        return start;
//    }
//
//    // Method to search for a node by data and update it
//    public static void search(Node start) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter data to search: ");
//        int data = sc.nextInt();
//        Node temp = start;
//
//        while (temp != null) {
//            if (temp.data == data) {
//                System.out.print("Enter new data: ");
//                temp.data = sc.nextInt();
//                System.out.println("Data updated.");
//                return;
//            }
//            temp = temp.next;
//        }
//        System.out.println("Data not found.");
//    }
//}
//
//public class Practice_Set {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        Node start = null;
//        int choice;
//
//        while (true) {
//            System.out.println("\n0: Exit");
//            System.out.println("1: Display");
//            System.out.println("2: Insert");
//            System.out.println("3: Delete");
//            System.out.println("4: Search");
//            System.out.print("Enter your choice: ");
//            choice = sc.nextInt();
//
//            switch (choice) {
//                case 0:
//                    System.out.println("Exiting...");
//                    return;
//
//                case 1:
//                    Node.display(start);
//                    break;
//
//                case 2:
//                    start = Node.insert(start);
//                    break;
//
//                case 3:
//                    start = Node.delete(start);
//                    break;
//
//                case 4:
//                    Node.search(start);
//                    break;
//
//                default:
//                    System.out.println("Invalid Choice!");
//            }
//        }
//    }
//}