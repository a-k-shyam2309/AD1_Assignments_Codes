public class Q5_i {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,4};
        int result = find(arr);
        System.out.println(result);
    }
    public static int find(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }
        return -1;
    }
}
