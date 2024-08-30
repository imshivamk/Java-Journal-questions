// Q.1 Write a java program to display table of a given number

import java.util.Scanner;

public class Q1Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();
        System.out.println("The table of "+ num);
        for(int i = 1; i <= 10; i++){
            System.out.println(num*i);
        }
    }
}

