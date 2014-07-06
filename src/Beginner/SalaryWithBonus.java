package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class SalaryWithBonus {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        String employee = s.nextLine();
        double salary = s.nextDouble();
        double valueSold = s.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", salary + valueSold*0.15);

    }

}
