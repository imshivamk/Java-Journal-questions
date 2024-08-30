// Q.2 Write a java program to find out sum of digit of given number

import java.util.Scanner;

public class Q2SumOfDigits {
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sumOfDigits(num);

    }
    static int sumOfDigits(int num){
        int sum = 0;
        int rem;
        while (num!=0) {
            rem = num%10;
            sum+= rem;
            num/= 10;
        }
        System.out.println("The sum of digits in java are "+ sum);

        return sum;
    }

}
