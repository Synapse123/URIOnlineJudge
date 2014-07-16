package Beginner;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TriangleTypes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double[] points = new double[]{s.nextDouble(), s.nextDouble(), s.nextDouble()};

        Arrays.sort(points);

        if(points[2] >= points[1] + points[0]){
            System.out.println("NAO FORMA TRIANGULO");
        }
        if(Math.pow(points[2], 2) == Math.pow(points[1], 2) + Math.pow(points[0], 2)){
            System.out.println("TRIANGULO RETANGULO");
        }else if(Math.pow(points[2], 2) > Math.pow(points[1], 2) + Math.pow(points[0], 2)){
            System.out.println("TRIANGULO OBTUSANGULO");
        }else if(Math.pow(points[2], 2) < Math.pow(points[1], 2) + Math.pow(points[0], 2)){
            System.out.println("TRIANGULO ACUTANGULO");
        }
        if(points[2] == points[1] && points[1] == points[0]){
            System.out.println("TRIANGULO EQUILATERO");
        }else if(points[2] == points[1] || points[1] == points[0] || points[2] == points[0]){
            System.out.println("TRIANGULO ISOSCELES");
        }

    }

}
