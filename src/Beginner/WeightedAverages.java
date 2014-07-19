package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class WeightedAverages {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){

            double avg = (s.nextDouble() * 2 + s.nextDouble() * 3 + s.nextDouble() * 5) / 10;

            System.out.printf("%.1f\n", avg);

        }

    }

}
