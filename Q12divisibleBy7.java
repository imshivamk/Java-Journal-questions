public class Q12divisibleBy7 {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 and 100 divisible by 7:");
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by 7
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
    }
}