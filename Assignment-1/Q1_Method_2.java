import java.util.Scanner;
public class Q1_Method_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = (n * (n + 1)) / 2;
        System.out.println("Sum is: " + sum);
    }
}
