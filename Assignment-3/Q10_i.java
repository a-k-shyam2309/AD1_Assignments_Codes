public class Q10_i {
    public static void main(String[] args) {
        int arr[]= {1,2,3,1,1,4,5,6,5};
        int result[] = sort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int [] sort(int arr[]){
        int n = arr.length;
        int result[] = new int[n];
        int k=0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (arr[i] != arr[j]){
                    result[k] = arr[i];
                    k++;
                }
            }
        }
        return result;
    }
}
