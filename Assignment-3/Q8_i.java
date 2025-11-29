public class Q8_i {
    public static void main(String[] args) {
        int arr[] = {1,3,6,11,7,15};
        int min = arr[1]-arr[0];
        int max = arr[1]-arr[0];

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]-arr[i] <= 0){
                    continue;
                }
                if (arr[j]-arr[i] < min){
                    min = arr[j]-arr[i];
                }
                if (arr[j]-arr[i] > max){
                    max = arr[j]-arr[i];
                }

            }
        }
        System.out.println(min);
        System.out.println(max);

    }
}
