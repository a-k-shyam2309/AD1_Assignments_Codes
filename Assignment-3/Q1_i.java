
// SELECTION SORT

import java.util.*;
public class Q1_i {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int arr[] = {3,6,1,8,2,7};
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
