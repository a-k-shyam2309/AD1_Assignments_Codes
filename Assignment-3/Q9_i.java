public class Q9_i {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,2,4,2};
        int count_2 = 0;
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            int count_1=1;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    count_1++;
                }
            }
            if (count_1 > count_2){
                result = arr[i];
            }
        }
        System.out.println(result);
    }
}
