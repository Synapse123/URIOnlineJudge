package Beginner;

import java.util.Locale;
import java.util.Scanner;

// 11/07/14: ranked nr. 70 (java)

public class SuperiorArea {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        String op = s.nextLine();

        double sum = 0;
        for(int i = 0; i < 5; i++){

            int pad = i+1;

            for(int j = 0; j < pad; j++){
                s.nextDouble();
            }

            for(int j = pad; j < 12-pad; j++){
                sum += s.nextDouble();
            }

            for(int j = 0; j < pad; j++){
                s.nextDouble();
            }

        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/30);

    }

}
