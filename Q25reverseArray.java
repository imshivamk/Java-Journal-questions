//Q.25 Write a program to copy the contents of one array into another in reverse order.

public class Q25reverseArray {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = array1[array1.length - i - 1];
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
    }
}
