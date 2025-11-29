import java.util.Scanner;

public class Q2 {
    public static String toHex(int decimal) {
        if (decimal == 0) {
            return "";
        }

        int remainder = decimal % 16;
        char hexChar;

        if (remainder < 10) {
            hexChar = (char) ('0' + remainder);
        } else {
            hexChar = (char) ('A' + (remainder - 10));
        }

        return toHex(decimal / 16) + hexChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = scanner.nextInt();

        if (decimal == 0) {
            System.out.println("Hexadecimal: 0");
        } else {
            String hex = toHex(decimal);
            System.out.println("Hexadecimal: " + hex);
        }
    }
}
