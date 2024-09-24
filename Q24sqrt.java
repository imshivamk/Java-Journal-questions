//Q.24 Write a Java program to find a Square of given number 
//belonging to the three data types, namely Integers, Floating Point & Double 
//using Overloading of Fucntions

public class Q24sqrt {
    public static void main(String[] args) {
        System.out.println(sqrt(25));
        System.out.println(sqrt(25.4f));
        System.out.println(sqrt(80.86f));

    }

    static int sqrt(int num){
        return (int) Math.sqrt(num);
    }

    static double sqrt(double num){
        return Math.sqrt(num);
    }

    static float sqrt(float num){
        return (float) Math.sqrt(num);
    }
}
