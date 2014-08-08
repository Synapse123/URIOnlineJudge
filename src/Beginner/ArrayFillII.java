package Beginner;

import java.util.Scanner;

public class ArrayFillII {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < 1000; i++){

            System.out.printf("N[%d] = %d\n", i, i%n);

        }

    }

}
