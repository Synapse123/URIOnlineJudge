package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Triangle {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();

        if(Math.abs(b-c) < a && a < b+c && Math.abs(a-c) < b && b < a+c && Math.abs(a-b) < c && c < a+b){
            System.out.printf("Perimetro = %.1f\n", a+b+c);
        }else{
            System.out.printf("Area = %.1f\n", (a+b)*c/2);
        }

    }

}
