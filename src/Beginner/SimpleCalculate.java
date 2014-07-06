package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class SimpleCalculate {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int prodId1 = s.nextInt();
        int amount1 = s.nextInt();
        double price1 = s.nextDouble();
        int prodId2 = s.nextInt();
        int amount2 = s.nextInt();
        double price2 = s.nextDouble();

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", amount1*price1 + amount2*price2);

    }


}
