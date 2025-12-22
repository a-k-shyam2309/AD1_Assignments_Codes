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
//public class Q3 {
//    public static void preorder(Node root) {
//        if (root != null) {
//            System.out.print(root.value + " ");
//            preorder(root.left);
//            preorder(root.right);
//        }
//    }
//
//    public static void inorder(Node root) {
//        if (root != null) {
//            inorder(root.left);
//            System.out.print(root.value + " ");
//            inorder(root.right);
//        }
//    }
//    public static void postorder(Node root) {
//        if (root != null) {
//            postorder(root.left);
//            postorder(root.right);
//            System.out.print(root.value + " ");
//        }
//    }
//
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//
//        System.out.println("Preorder Traversal:");
//        preorder(root);
//
//        System.out.println("\nInorder Traversal:");
//        inorder(root);
//
//        System.out.println("\nPostorder Traversal:");
//        postorder(root);
//    }
//}
