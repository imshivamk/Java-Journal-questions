// Q.15 Write a program to convert binary number to its decimal equivalent.
import java.util.Scanner;

public class Q15 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from the user
        System.out.print("Enter a binary number: ");
        String binaryString = scanner.nextLine();

        // Convert binary to decimal
        int decimal = Integer.parseInt(binaryString, 2);

        // Display the result
        System.out.println("Decimal: " + decimal);
        
        scanner.close();
    }
}
