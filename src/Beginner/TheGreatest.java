package Beginner;

import java.util.Scanner;

public class TheGreatest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int maxAB = (a + b + Math.abs(a - b)) / 2;
        int maxABC = (maxAB + c + Math.abs(maxAB - c)) / 2;

        System.out.printf("%d eh o maior\n", maxABC);

    }

}
