import java.util.Scanner;

// Q.11 Write a program to check whether a given number is Perfect or not.
public class Q11PerfectNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        perfectOrNot(num);
    }
    static void perfectOrNot(int num){
        int num2 = num;
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num%i==0){
                sum = sum + i;
            }
        }

        if (sum==num2){
            System.out.println("Perfect number");
        }
        else{
            System.out.println("Not a perfect number");
        }
    }
}
