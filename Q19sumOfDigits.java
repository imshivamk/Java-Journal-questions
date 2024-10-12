import java.util.Scanner;

public class Q19sumOfDigits {
    // Q.19 Write a Java program than read an integer and
    // calculate the sum of its digits and 
    // write the number of each digit of the sum in English.
    public static void main(String[] args) {

        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("The sum of the digits are " + sum);
        while (sum!=0) {
            int rem = sum%10;
            printNumber(rem);
            sum /= 10;
        }
        
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

    static void printNumber(int num){
        switch (num) {
            case 0:
            System.out.println("Zero");
            break;
            case 1:
            System.out.println("One");
            break;
            case 2:
            System.out.println("Two");
            break;
            case 3:
            System.out.println("Three");
            break;
            case 4:
            System.out.println("Four");
            break;
            case 5:
            System.out.println("five");
            break;
            case 6:
            System.out.println("Six");
            break;
            case 7:
            System.out.println("Seven");
            break;
            case 8:
            System.out.println("Eight");
            break;
            case 9:
            System.out.println("Nine");
            break;

            default:
                break;
        }
    }
    

}
