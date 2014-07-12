package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Interval {

    public static final int[][] intervals = {{0,25}, {25,50}, {50,75}, {75,100}};

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double num = s.nextDouble();

        if(num < 0 || num > 100){
            System.out.println("Fora de intervalo");
        }else if(num >= 0 && num <= 25){
            System.out.printf("Intervalo [%d,%d]\n", intervals[0][0], intervals[0][1]);
        }else{
            for(int i = 1; i < intervals.length; i++){
                if(num > intervals[i][0] && num <= intervals[i][1]){
                    System.out.printf("Intervalo (%d,%d]\n", intervals[i][0], intervals[i][1]);
                }
            }
        }

    }

}