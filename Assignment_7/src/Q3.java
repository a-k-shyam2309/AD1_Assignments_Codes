class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SortedStack {
    private Node top;

    public void pushSorted(int value) {
        Node newNode = new Node(value);

        if (top == null || value >= top.data) {
            newNode.next = top;
            top = newNode;
        } else {
            Node current = top;
            while (current.next != null && current.next.data > value) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return -1;
        }
        int popped = top.data;
        top = top.next;
        return popped;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty");
            return -1;
        }
        return top.data;
    }

    public void display() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

public class Q3 {
    public static void main(String[] args) {
        SortedStack stack = new SortedStack();
        stack.pushSorted(10);
        stack.pushSorted(30);
        stack.pushSorted(20);
        stack.pushSorted(40);
        stack.display();
        System.out.println("Popped: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        stack.display();
    }
}
