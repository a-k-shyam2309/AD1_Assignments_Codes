public class q1 {
    public static void main(String[] args) {
        int arr[] = {12,23,34,45,56};
        int n = arr.length;
        int asc = 0;
        int des = 0;
        for (int i = 0; i < n-1; i++) {
            if (arr[i] < arr[i+1]){
                asc++;
            }
            else{
                des++;
            }
        }
        if (asc == n-1){
            System.out.println("Yes Ascending");
        }else if (des == n-1){
            System.out.println("Yes Descending");
        }else{
            System.out.println("No");
        }
    }
}
