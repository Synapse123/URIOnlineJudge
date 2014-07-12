package Beginner;

import java.util.Scanner;

public class Distance {

    public static final int velocityCar1 = 60;
    public static final int velocityCar2 = 90;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int distance = s.nextInt();

        System.out.printf("%d minutos\n", velocityCar1 * distance / (velocityCar2 - velocityCar1));

    }

}
