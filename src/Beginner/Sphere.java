package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Sphere {

    private static final double PI = 3.14159;

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int radius = s.nextInt();

        System.out.printf("VOLUME = %.3f\n", (4.0/3.0) * PI * Math.pow(radius, 3));

    }

}
