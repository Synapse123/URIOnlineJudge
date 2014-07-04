package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Salary {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner s = new Scanner(System.in);

        int number = s.nextInt();
        int hours = s.nextInt();
        double perHour = s.nextDouble();

        System.out.printf("NUMBER = %d\n", number);
        System.out.printf("SALARY = U$ %.2f\n", hours*perHour);

    }

}
