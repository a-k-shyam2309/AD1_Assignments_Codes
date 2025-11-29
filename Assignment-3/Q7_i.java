public class Q7_i {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9,10};
        System.out.println(missing(arr));
    }
    public static int missing(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] != i+1) {
                return i+1;
            }
        }
        return -1;
    }
}
