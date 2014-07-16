package Beginner;

import java.util.Scanner;

public class SimpleSort {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        int sA = Math.min(Math.min(a, b), c);
        int sC = Math.max(Math.max(a, b), c);
        int sB = a + b + c - sA - sC;

        System.out.printf("%d\n", sA);
        System.out.printf("%d\n", sB);
        System.out.printf("%d\n", sC);
        System.out.println();
        System.out.printf("%d\n", a);
        System.out.printf("%d\n", b);
        System.out.printf("%d\n", c);

    }

}
