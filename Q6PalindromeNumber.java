import java.util.Scanner;
// Q.6 Write a java program to check the given number is Palindrome Number or not
public class Q6PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        palindrome(num);

    }
    static void palindrome(int num){
        int num2 = num; // to store the original num for comparisn
        int rev = 0;
        int rem = 0;

        while (num!=0){
            rem = num%10;
            rev = rev*10 + rem;
            num = num/10;
        }

        if (rev==num2){
            System.out.println("it is a palindrome number");
        }
        else{
            System.out.println("it is NOT a palindrome number");

        }
    }
}
