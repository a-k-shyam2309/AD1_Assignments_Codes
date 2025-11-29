public class Q2_i {
    public static void main(String[] args) {
        int arr[] = {5,1,1,1,2,3,5};
        reduction(arr);

    }

    public static void reduction(int arr[]){
        if (arr[0] == 0){
            return;
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == min){
                for (int j = i; j < arr.length; j++) {
                    arr[j] = arr[j+1];
                }
            }
            arr[i] = arr[i]-1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        reduction(arr);
    }
}
