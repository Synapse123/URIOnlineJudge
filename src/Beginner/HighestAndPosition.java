package Beginner;

import java.util.Scanner;

public class HighestAndPosition {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int index = 0;
        int max = Integer.MIN_VALUE;

        for(int i = 1; i <= 100; i++){

            int x = s.nextInt();

            if(x > max){
                max = x;
                index = i;
            }

        }

        System.out.println(max);
        System.out.println(index);

    }

}
