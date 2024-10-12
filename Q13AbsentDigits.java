import java.util.Scanner;

public class Q13AbsentDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] nums = makeArray(num);

        System.out.println("The absent digits from the number: ");
        for (int i = 0; i <=9 ; i++) {
            boolean present = false;
            for (int j = 0; j <= numberOfdigits(num, nums) ; j++) {
                if (nums[j]==i) {
                    present = true;
                }
            }
            if (!present) {
                System.out.println(i);
            }
        }
        
    }

    static int[] makeArray(int num){
        int[] nums = new int[10];
        for (int i = 0; num!=0; i++) {
            int rem = num%10;
            nums[i] = rem;
            num = num/10;
        }
        return nums;
    }

    static int numberOfdigits(int num, int[] nums){
        int count = 0;

        for(int i = 0; num!=0; i++) {
            int rem = num%10;
            nums[i] = rem;
            count++;
            num /= 10;
        }
        return count;
    }
}