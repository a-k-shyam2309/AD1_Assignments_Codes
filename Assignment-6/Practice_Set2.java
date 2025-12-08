//import java.util.Scanner;
//
//class DoublyNode {
//    int data;
//    DoublyNode next;
//    DoublyNode prev;
//
//    // Constructor to create a new node
//    DoublyNode(int data) {
//        this.data = data;
//        this.next = null;
//        this.prev = null;
//    }
//
//    // Method to display the doubly linked list
//    public static void display(DoublyNode start) {
//        if (start == null) {
//            System.out.println("List is empty.");
//            return;
//        }
//        DoublyNode temp = start;
//        while (temp != null) {
//            System.out.print(temp.data + " <-> ");
//            temp = temp.next;
//        }
//        System.out.println("null");
//    }
//
//    // Method to insert a node at a specific position
//    public static DoublyNode insert(DoublyNode start) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Data: ");
//        int data = sc.nextInt();
//        System.out.print("Enter Position: ");
//        int position = sc.nextInt();
//
//        DoublyNode newNode = new DoublyNode(data);
//
//        if (position == 1) {  // Insert at the beginning
//            if (start != null) {
//                start.prev = newNode;
//            }
//            newNode.next = start;
//            start = newNode;
//            return start;
//        } else if (position > 1) {  // Insert at the given position
//            DoublyNode temp = start;
//            int i = 1;
//            while (i < position - 1 && temp != null) {
//                temp = temp.next;
//                i++;
//            }
//            if (temp != null) {
//                newNode.next = temp.next;
//                if (temp.next != null) {
//                    temp.next.prev = newNode;
//                }
//                temp.next = newNode;
//                newNode.prev = temp;
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
//    // Method to delete a node at a specific position
//    public static DoublyNode delete(DoublyNode start) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Position to delete: ");
//        int position = sc.nextInt();
//
//        if (start == null) {
//            System.out.println("List is empty.");
//            return start;
//        }
//
//        if (position == 1) {  // Delete the first node
//            start = start.next;
//            if (start != null) {
//                start.prev = null;
//            }
//            return start;
//        }
//
//        DoublyNode temp = start;
//        int i = 1;
//        while (i < position && temp != null) {
//            temp = temp.next;
//            i++;
//        }
//
//        if (temp != null) {
//            if (temp.next != null) {
//                temp.next.prev = temp.prev;
//            }
//            if (temp.prev != null) {
//                temp.prev.next = temp.next;
//            }
//        } else {
//            System.out.println("Invalid Position");
//        }
//
//        return start;
//    }
//
//    // Method to search for a node by data and update it
//    public static void search(DoublyNode start) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter data to search: ");
//        int data = sc.nextInt();
//        DoublyNode temp = start;
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
//public class Practice_Set2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        DoublyNode start = null;
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
//                    DoublyNode.display(start);
//                    break;
//
//                case 2:
//                    start = DoublyNode.insert(start);
//                    break;
//
//                case 3:
//                    start = DoublyNode.delete(start);
//                    break;
//
//                case 4:
//                    DoublyNode.search(start);
//                    break;
//
//                default:
//                    System.out.println("Invalid Choice!");
//            }
//        }
//    }
//}
