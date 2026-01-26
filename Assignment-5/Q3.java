import java.util.Scanner;

class KthLargestHeap {

    // Heapify function (Max Heap)
    static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;

        if (right < n && arr[right] > arr[largest])
            largest = right;

        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }

    // Build Max Heap
    static void buildHeap(int[] arr, int n) {
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
    }

    // Delete max element from heap
    static int deleteMax(int[] arr, int n) {
        int max = arr[0];
        arr[0] = arr[n - 1];
        heapify(arr, n - 1, 0);
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter k: ");
        int k = sc.nextInt();

        buildHeap(arr, n);

        int result = 0;
        int size = n;

        for (int i = 1; i <= k; i++) {
            result = deleteMax(arr, size);
            size--;
        }

        System.out.println("Kth largest element is: " + result);
    }
}
