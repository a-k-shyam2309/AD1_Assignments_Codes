//class Node {
//    int value;
//    Node left, right;
//
//    public Node(int item) {
//        value = item;
//        left = right = null;
//    }
//}
//
//public class Q6 {
//    public static int findMaxValue(Node root) {
//        if (root == null) {
//            return Integer.MIN_VALUE;
//        }
//        int leftMax = findMaxValue(root.left);
//        int rightMax = findMaxValue(root.right);
//        return Math.max(root.value, Math.max(leftMax, rightMax));
//    }
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        System.out.println("Maximum value in the binary tree: " + findMaxValue(root));
//    }
//}