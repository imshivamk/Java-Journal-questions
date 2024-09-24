import java.util.Scanner;

public class Q10Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        Armstrong(num);
    }

    static void Armstrong(int num){
        int num2 = num;
        int sum = 0;
        int rem = 0;
        int n = numberOfDigits(num);
        while (num!=0) {
            rem = num%10;
            sum = sum + (int) Math.pow(rem,n);
            num = num/10;
        }

        if (sum==num2){
            System.out.println("Armstrong number");
        }
        else{
            System.out.println("Not armstrong number");
        }
    }
    
    static int numberOfDigits(int num){
        int n = 0;
        while(num!=0){
            n++;
            num=num/10;
        }
        return n;
    }
}
