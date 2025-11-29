public class Q1_e {
    public static void main(String[] args) {
        int[] sortedArray = {2, 4, 6, 8, 10, 12, 14, 16};
        int target = 10;

        int result = binarySearch(sortedArray, target, 0, sortedArray.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }

    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Target not found
        }

        int mid = low + (high - low) / 2;

        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] > target) {
            return binarySearch(arr, target, low, mid - 1); // Search left half
        } else {
            return binarySearch(arr, target, mid + 1, high); // Search right half
        }
    }
}
