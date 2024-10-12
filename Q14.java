import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a decimal number: ");
        int decimalNumber = scanner.nextInt();

        // Convert decimal to binary
        String binary = Integer.toBinaryString(decimalNumber);
        // Convert decimal to octal
        String octal = Integer.toOctalString(decimalNumber);
        // Convert decimal to hexadecimal
        String hexadecimal = Integer.toHexString(decimalNumber).toUpperCase();

        // Display the results
        System.out.println("Binary: " + binary);
        System.out.println("Octal: " + octal);
        System.out.println("Hexadecimal: " + hexadecimal);
        
        scanner.close();
    }
}
