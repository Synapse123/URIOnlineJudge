package Beginner;

import java.util.Scanner;

public class AgeInDays {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int ageInDays = s.nextInt();

        int years = ageInDays / 365;
        int months = (ageInDays - years * 365) / 30;
        int days = ageInDays - years * 365 - months * 30;

        System.out.printf("%d ano(s)\n", years);
        System.out.printf("%d mes(es)\n", months);
        System.out.printf("%d dia(s)\n", days);

    }

}
