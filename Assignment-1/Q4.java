import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter the elements in the Array:");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number to find in the Array: ");
        int k = sc.nextInt();
        for (int i = 0; i < size; i++) {
            if(arr[i] == k){
                System.out.println("The position of the number is : " +i);
                System.exit(0);
            }
        }
        System.out.println("Element not found");
    }
}
