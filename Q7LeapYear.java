import java.util.Scanner;

//Q.7 Write a java program to check given year is leap year or not
public class Q7LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        leapOrNot(year);

    }
    static void leapOrNot(int year){
        boolean leap = false; // initially
        if (year%4==0){
            if (year%100==0){
                if (year%400==0){
                    leap = true;
                }
            }
            else {
                leap = true;
            }
        }
        if (leap){
            System.out.println(year + " is  a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
    }
}
