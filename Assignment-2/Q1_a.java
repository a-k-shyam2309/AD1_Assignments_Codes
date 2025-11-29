import java.util.*;
public class Q1_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int res = sum(n);
        System.out.println(res);
    }

//  Method-I
    public static void sumOf(int n , int sum){
        if (n==0){
            System.out.println("The sum is: " + sum);
            System.exit(0);
        }
        sum = sum+n;
        sumOf(n-1 , sum);

    }

//  Method-II
    public static int sum(int n){
        if (n==0){
            return 0;
        }
        return n + sum(n - 1);
    }
}
