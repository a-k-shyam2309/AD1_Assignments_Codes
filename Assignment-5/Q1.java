public class Q1 {

    // Function to check if a given list is a MIN-Priority Queue
    public static String isMinPriorityQueue(int[] arr) {
        int n = arr.length;

        // Traverse through all non-leaf nodes
        for (int i = 0; i <= (n - 2) / 2; i++) {
            // Get left and right child indices
            int leftChild = 2 * i + 1;
            int rightChild = 2 * i + 2;

            // Compare with left child
            if (leftChild < n && arr[i] > arr[leftChild]) {
                return "NO";
            }

            // Compare with right child
            if (rightChild < n && arr[i] > arr[rightChild]) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 2, 7, 4, 6, 5, 8};
        System.out.println(isMinPriorityQueue(arr1)); // Output: YES

        int[] arr2 = {1, 3, 4, 7, 2, 5, 6, 8};
        System.out.println(isMinPriorityQueue(arr2)); // Output: NO
    }
}
