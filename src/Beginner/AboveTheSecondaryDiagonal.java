package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class AboveTheSecondaryDiagonal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        String op = s.nextLine();

        double sum = 0;
        for(int i = 11; i >= 0; i--){

            for(int j = 0; j < i; j++){
                sum += s.nextDouble();
            }

            for(int j = i; j < 12; j++){
                s.nextDouble();
            }

        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/66);

    }

}
