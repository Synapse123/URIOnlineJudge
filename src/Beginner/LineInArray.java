package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class LineInArray {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int line = Integer.parseInt(s.nextLine());
        String op = s.nextLine();

        for(int i = 0; i < 12 * line; i++){
            s.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < 12; i++){
            sum += s.nextDouble();
        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/12);

    }

}
