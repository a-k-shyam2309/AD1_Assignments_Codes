//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int val) {
//        this.val = val;
//        this.left = null;
//        this.right = null;
//    }
//}
//
//public class Q1 {
//    public static TreeNode buildTree(int[] arr, int i) {
//        if (i >= arr.length) {
//            return null;
//        }
//        TreeNode root = new TreeNode(arr[i]);
//        root.left = buildTree(arr, 2 * i + 1);
//        root.right = buildTree(arr, 2 * i + 2);
//        return root;
//    }
//    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        TreeNode root = buildTree(arr, 0);
//        System.out.println("Complete Binary Tree Created Successfully.");
//    }
//}
