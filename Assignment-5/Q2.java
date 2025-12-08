public class Q2 {

    // Function to increase key of a specific element in a MAX-Priority Queue
    public static void increaseKey(int[] heap, int index, int newValue) {
        // Step 1: Increase the key value at the given index
        if (newValue < heap[index]) {
            System.out.println("New value is smaller than the current value.");
            return;
        }

        heap[index] = newValue;

        // Step 2: Bubble up the element to restore the max-heap property
        while (index > 0 && heap[parent(index)] < heap[index]) {
            // Swap the element with its parent
            swap(heap, index, parent(index));
            index = parent(index);
        }
    }

    // Function to find the parent of a node
    private static int parent(int i) {
        return (i - 1) / 2;
    }

    // Function to swap two elements in the array
    private static void swap(int[] heap, int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    public static void main(String[] args) {
        int[] heap = {8, 5, 7, 4, 1, 6, 3, 2};
        increaseKey(heap, 2, 9);  // Increase key at index 2 to 9

        // Print the updated heap
        for (int value : heap) {
            System.out.print(value + " ");
        }
    }
}
