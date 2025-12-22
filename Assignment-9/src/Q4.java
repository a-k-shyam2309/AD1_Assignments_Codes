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
//public class Q4 {
//    public static void printPaths(Node root) {
//        int[] path = new int[1000];
//        printPathsRecursive(root, path, 0);
//    }
//    public static void printPathsRecursive(Node root, int[] path, int pathLength) {
//        if (root == null) {
//            return;
//        }
//        path[pathLength] = root.value;
//        pathLength++;
//        if (root.left == null && root.right == null) {
//            printPath(path, pathLength);
//        } else {
//            printPathsRecursive(root.left, path, pathLength);
//            printPathsRecursive(root.right, path, pathLength);
//        }
//    }
//    public static void printPath(int[] path, int pathLength) {
//        for (int i = 0; i < pathLength; i++) {
//            System.out.print(path[i] + " ");
//        }
//        System.out.println();
//    }
//    public static void main(String[] args) {
//        Node root = new Node(1);
//        root.left = new Node(2);
//        root.right = new Node(3);
//        root.left.left = new Node(4);
//        root.left.right = new Node(5);
//        System.out.println("All paths from root to leaf nodes:");
//        printPaths(root);
//    }
//}