package Beginner;

import java.util.Scanner;

public class ArrayReplacementI {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(int i = 0; i < 10; i++){

            int x = s.nextInt();

            System.out.printf("X[%d] = %d\n", i, x <= 0 ? 1 : x);

        }

    }

}
