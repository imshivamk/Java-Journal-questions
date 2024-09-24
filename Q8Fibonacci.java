import java.util.Scanner;

// Q.8 Write a java program to display the Fibonacci Series up to the limit
public class Q8Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms in the series:");
        int limit = sc.nextInt();
        int t1,t2,t3;
        t1 = 0;
        t2 = 1;
        t3 = 0;
        // initially
        System.out.println("The fibonacci series is:");
        System.out.print(t1 + ", " + t2 + ", ");
        for (int i = 0; i < limit; i++) {
            t3 = t1 + t2;
            System.out.print(t3 + ", ");
            t1 = t2;
            t2 = t3;
        }

    }
}
