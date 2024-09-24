import java.util.Scanner;

public class Q5PrimeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first term:");
        int a = sc.nextInt();
        System.out.println("Enter last term:");
        int b = sc.nextInt();
        primeSeries(a,b);
    }
    static void primeSeries(int a, int b){
        System.out.println("The prime series is:");
        for (int i = a; i <= b ; i++) {
            int count = 0;
            for (int j = 2; j < i ; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if (count==0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
    }
}
