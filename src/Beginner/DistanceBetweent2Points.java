package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class DistanceBetweent2Points {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int x1 = s.nextInt();
        int y1 = s.nextInt();
        int x2 = s.nextInt();
        int y2 = s.nextInt();

        double distance = Math.sqrt((double) Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("%.4f\n", distance);

    }

}
