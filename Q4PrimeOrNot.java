import java.util.Scanner;

public class Q4PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int num = sc.nextInt();
        primeOrNot(num);
    }
    static void primeOrNot(int num){
        int count = 0;
        for (int i = 2; i < num - 1; i++) {
            if (num%i==0){
                count++;
            }
        }
        if (count == 0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }

}
