import java.util.Scanner;
import java.lang.*;

public class Q18powerOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (powerOf4(num)) {
            System.out.println("The number is a power of 4");
        }
        else{
            System.out.println("The number is NOT a power of 4");

        }

    }

    static boolean powerOf4(int num){

        for (int i = 0; i < 100; i++) {
            if (Math.pow(4,i)==num) {
                return true;
            }
        }

        return false;
    }
}
