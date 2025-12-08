import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }


    public static Node insertSorted(Node start){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter data to insert: ");
        int value = sc.nextInt();

        Node newNode = new Node(value);
        if(start == null || value < start.data){
            newNode.next = start;
            start = newNode;
            return start;
        }
        Node temp = start;
        while(temp.next != null && temp.next.data < value){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return start;
    }


    public void display(Node start){
        if(start == null){
            System.out.println("List is empty");
            return;
        }

        Node temp = start;
        System.out.println("\nFinal Sorted Linked List:");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Node start = null;
        Node obj1 = new Node(0);

        System.out.print("Enter number of integers to enter: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " integers below (one by one)");

        for(int i = 0; i < n; i++){
            start = Node.insertSorted(start);
        }

        obj1.display(start);
    }
}