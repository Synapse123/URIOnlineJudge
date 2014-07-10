package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Consumption {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int distance = s.nextInt();
        double fuel = s.nextDouble();

        System.out.printf("%.3f km/l\n", distance / fuel);

    }

}
