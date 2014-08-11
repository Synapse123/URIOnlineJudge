package Beginner;

import java.util.Locale;
import java.util.Scanner;

// 11/07/14: ranked nr. 68 (java)

public class RightArea {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        String op = s.nextLine();

        double sum = 0;

        for(int i = 0; i <= 5; i++){

            for(int j = 0; j < 12-i; j++){
                s.nextDouble();
            }

            for(int j = 12-i; j < 12; j++){
                sum += s.nextDouble();
            }

        }

        for(int i = 5; i >= 0; i--){

            for(int j = 0; j < 12-i; j++){
                s.nextDouble();
            }

            for(int j = 12-i; j < 12; j++){
                sum += s.nextDouble();
            }

        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/30);

    }

}
