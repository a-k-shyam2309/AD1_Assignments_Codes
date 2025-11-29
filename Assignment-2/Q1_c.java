import java.util.*;
public class Q1_c {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a = 0;
        int b = 1;
        int n = sc.nextInt();
        fibo(a,b,n);
    }

    public static void fibo(int a , int b , int n ){
        if (n==1){
            System.out.println(a);
            System.exit(0);
        }
        int temp = a+b;
        a=b;
        b=temp;
        fibo(a,b,n-1);
    }
}
