package Beginner;

import java.util.Scanner;

public class ArrayChangeI {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] numbers = new int[20];

        for(int i = 0; i < 20; i++){

            numbers[i] = s.nextInt();

        }

        for(int i = 0; i < 20; i++){
            System.out.printf("N[%d] = %d\n", i, numbers[19-i]);
        }

    }

}
