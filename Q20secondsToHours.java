// Q.20 Write a Java program to convert seconds to hour, minute and seconds.

import java.util.Scanner;

public class Q20secondsToHours {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter total seconds");
        int secs = sc.nextInt();
        int secondsInHour = 60*60;
        int hours, minutes, seconds;
        int remainingSecondsInHour = secs%3600;
        int remainingSecondsInMinute = secs%60;
        hours = secs/secondsInHour;
        minutes = remainingSecondsInHour/60;
        seconds = remainingSecondsInMinute;

        System.out.println(hours + " : " + minutes + " : " + seconds);

    }
}
