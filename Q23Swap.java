    // Q.23 Write a program to demonstrate how Function Overloading is carried out 
    //for Swapping of two variables of the various data types 
    //namely Intergers, Floating Point Numbers & Character Type

public class Q23Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        swap(a,b);
        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }

    static void swap(int a, int b){

        int temp = a;
        a = b;
        b = a;

        System.out.println("a : " + a);
        System.out.println("b : " + b);
    }   

    static void swap(double a, double b){

    }

    static void swap(char a, char b){

    }
}

