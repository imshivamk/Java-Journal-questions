import java.util.Scanner;
// Q.3 Write a java program to reverse a given number
public class Q3Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        System.out.println("The reverse of the number is " + Reverse(num));
    }
    static int Reverse(int num){
        int rev = 0;
        int rem = 0;
        int sum = 0;

        while (num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }

        return rev;
    }
}