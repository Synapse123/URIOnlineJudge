package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class ArrayFillIII {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double x = s.nextDouble();

        for(int i = 0; i < 100; i++){

            System.out.printf("N[%d] = %.4f\n", i, x);
            x /= 2;

        }

    }

}
