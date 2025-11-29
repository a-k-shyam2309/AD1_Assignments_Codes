public class Q3_i {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4};
        int arr2[] = {5,6,7,8};
        int n = arr1.length;
        int m = arr2.length;
        int arr3 [] = new int[n+m];
        int idx = 0;
        while(idx<n){
            arr3[idx] = arr1[idx];
            idx++;
        }
        int count=0;
        while(idx<n+m){
            arr3[idx] = arr2[count];
            idx++;
            count++;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.println(arr3[i]);
        }
    }
}
