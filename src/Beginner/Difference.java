package Beginner;

import java.util.Scanner;

public class Difference {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        int d = s.nextInt();

        System.out.printf("DIFERENCA = %d\n", a*b - c*d);

    }

}
