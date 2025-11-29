public class Q6_i {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,4};
        int result[] = find(arr);
        for (int i = 0; i < result.length; i++) {
            if (result[i] != 0 ){
                System.out.println(result[i]);
            }
        }
    }
    public static int[] find(int arr[]){
        int n = arr.length;
        int result[] = new int [n];
        int k=0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    result[k] = arr[i];
                    k++;
                }
            }
        }
        return result;
    }
}
