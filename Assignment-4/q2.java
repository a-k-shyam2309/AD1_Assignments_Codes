public class q2 {
    public static void main(String[] args) {
        int arr1[] = {1,5,4,3,7};
        int arr2[] = {2,9,6,7,8};
        int val = 4;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (Math.abs(arr1[i] - arr2[j]) == val){
                    System.out.println("(" + arr1[i] + "," + arr2[j] + ")");
                }
            }
        }
    }
}
