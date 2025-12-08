import java.util.PriorityQueue;

public class Q3 {

    // Function to find the kth largest element
    public static int findKthLargest(int[] nums, int k) {
        // Create a min-heap of size k
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        // Add the first k elements to the heap
        for (int i = 0; i < k; i++) {
            minHeap.add(nums[i]);
        }

        // Process the remaining elements
        for (int i = k; i < nums.length; i++) {
            if (nums[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }

        // The root of the heap is the kth largest element
        return minHeap.peek();
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;
        System.out.println("The " + k + "th largest element is: " + findKthLargest(nums, k));
    }
}
