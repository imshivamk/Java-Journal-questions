import java.util.Scanner;

public class Q16 {
    // Q.16 Write a Java program that 
    //searches a value in an m x n matrix.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] matrix = {
            {10,20,30},
            {40,50,60},
            {70,80,90}
        };

        int target = sc.nextInt();
        searchMatrix(matrix, target);
    }

    static boolean searchMatrix(int[][] matrix, int target){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j]==target) {
                    System.out.println("Number found in the matrix at ");
                    System.out.println("row : " + i+1);
                    System.out.println("column : " + j+1);
                    return true;
                }
            }
        }
        return false;
    }
}
