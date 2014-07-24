package Beginner;

import java.util.Scanner;

public class ArrayFillI {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();

        for(int i = 0; i < 10; i++){

            System.out.printf("N[%d] = %d\n", i, x);

            x *= 2;

        }

    }

}
