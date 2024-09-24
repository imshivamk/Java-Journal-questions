// Q.26. Write a program to sort elements stored in an array.

public class Q26sort {
    public static void main(String[] args) {
        int[] arr = {2,5,1,3,4};
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    static void sort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
