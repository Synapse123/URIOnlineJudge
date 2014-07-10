package Beginner;

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int duration = s.nextInt();

        int hours = duration / 3600;
        int minutes = (duration - hours * 3600) / 60;
        int seconds = duration - hours * 3600 - minutes * 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

    }

}
