package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class ColumnInArray {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int column = Integer.parseInt(s.nextLine());
        String op = s.nextLine();

        for(int i = 0; i < column; i++){
            s.nextDouble();
        }

        double sum = 0;
        for(int i = 0; i < 11; i++){
            sum += s.nextDouble();
            for(int j = 0; j < 11; j++){
                s.nextDouble();
            }
        }
        sum += s.nextDouble();

        System.out.printf("%.1f\n", "S".equals(op) ? sum : sum/12);

    }

}
