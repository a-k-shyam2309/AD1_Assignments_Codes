public class q4 {
    public static void main(String[] args) {
        int arr[] = {4,8,1,2,16,15};
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    continue;
                }
                int sum1 = arr[i] + arr[j];
                int sum2 = 0;

                for (int k = 0; k < arr.length; k++) {
                    if (arr[j] == arr[k] || arr[i] == arr[k]){
                        continue;
                    }
                    sum2 = sum2 + arr[k] ;
                }

                if (sum1 == sum2){
                    System.out.println(arr[i] + "," +arr[j]);
                }
            }

        }
    }
}
