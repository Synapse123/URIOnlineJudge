package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class AboveTheMainDiagonal {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        String op = s.nextLine();

        double sum = 0;
        for(int i = 0; i < 12; i++){

            for(int j = 0; j < 12; j++){

                if(j <= i){
                    s.nextDouble();
                }else{
                    sum += s.nextDouble();
                }

            }

        }

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/66);

    }

}
