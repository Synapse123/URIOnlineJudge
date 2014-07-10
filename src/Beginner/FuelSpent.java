package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class FuelSpent {

    public static final int CONSUMPTION = 12;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int time = s.nextInt();
        int velocity = s.nextInt();

        int distance = time * velocity;

        System.out.printf("%.3f\n", (double) distance / CONSUMPTION);

    }

}
