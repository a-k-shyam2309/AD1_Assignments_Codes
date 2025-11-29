import java.util.Scanner;

public class Q1_d {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {6,3,7,2,1,9,4};
        LinearSr(arr,7,0);
    }

    public static void LinearSr(int arr[] , int k , int i){
        if(arr[i] == k){

            System.out.println(i);
            System.exit(0);
        }
        LinearSr(arr,k,i+1);
    }
}
