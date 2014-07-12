package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class BhaskarasFormula {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        double r = Math.sqrt(Math.pow(b,2) - 4*a*c);
        double r1 = (1/(2*a)) * ((-1)*b + r);
        double r2 = (1/(2*a)) * ((-1)*b - r);

        System.out.printf("R1 = %.5f\n", r1);
        System.out.printf("R2 = %.5f\n", r2);

    }

}
