public class q3 {
    public static void main(String[] args) {
        int val = 3;
        int arr[] = {15,7,22,9,18,4};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == 3){
                System.out.println(arr[i-1]);
            }
        }
    }
}
