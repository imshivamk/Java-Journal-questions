import java.util.Scanner;

// Q.9 Write a java program to find the factorial of a given number
public class Q9Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        System.out.println("The fcatorial of number is " + factorial(num));

    }
    static int factorial(int num){
        int f = 1;
        for (int i = 1; i <= num ; i++) {
            f = f * i;
        }
        return f;
    }
}
