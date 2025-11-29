import java.util.*;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a=0;
        int b=1;
        int res=0;
        int n = sc.nextInt();
        for (int i = 1; i <n; i++) {
            res = a+b;
            a=b;
            b=res;
        }
        System.out.println(a);
    }
}
