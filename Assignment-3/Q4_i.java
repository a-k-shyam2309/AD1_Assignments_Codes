public class Q4_i {
    public static void main(String[] args) {
        int arr[] = {1, 2, 6, 5, 4, 7};
        System.out.println(separate(arr));
    }

    public static boolean separate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int[] temp = new int[n];
                for (int k = 0; k < n; k++) {
                    temp[k] = arr[k];
                }
                sortSubarray(temp, i, j);
                if (isSorted(temp)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void sortSubarray(int arr[], int i, int j) {
        for (int p = i; p <= j; p++) {
            for (int q = p + 1; q <= j; q++) {
                if (arr[p] > arr[q]) {
                    int temp = arr[p];
                    arr[p] = arr[q];
                    arr[q] = temp;
                }
            }
        }
    }

    public static boolean isSorted(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

