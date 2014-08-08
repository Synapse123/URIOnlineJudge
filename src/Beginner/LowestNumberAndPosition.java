package Beginner;

import java.util.Scanner;

public class LowestNumberAndPosition {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int min = Integer.MAX_VALUE;
        int pos = 0;

        for(int i = 0; i < n; i++){

            int x = s.nextInt();

            if(x <= min){

                min = x;
                pos = i;

            }

        }

        System.out.println("Menor valor: " + min);
        System.out.println("Posicao: " + pos);

    }

}
