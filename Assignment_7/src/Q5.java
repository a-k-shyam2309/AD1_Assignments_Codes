import java.util.Stack;

public class Q5 {

    public static void insertAtBottom(Stack<Integer> stack, int x) {
        if (stack.isEmpty()) {
            stack.push(x);
            return;
        }
        int top = stack.pop();
        insertAtBottom(stack, x);
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        insertAtBottom(stack, 0);
        System.out.println(stack); // Output: [0, 1, 2, 3]
    }
}
