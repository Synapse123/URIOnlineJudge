package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class PositivesAndAverage {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double[] input = {
                s.nextDouble(),
                s.nextDouble(),
                s.nextDouble(),
                s.nextDouble(),
                s.nextDouble(),
                s.nextDouble()
        };

        int cnt = 0;
        double sum = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i] > 0){
                cnt++;
                sum += input[i];
            }
        }

        System.out.printf("%d valores positivos\n", cnt);
        System.out.printf("%.1f\n", sum/cnt);

    }

}
