package Beginner;

import java.util.Scanner;

public class EvenBetweenFiveNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] input = {
                s.nextInt(),
                s.nextInt(),
                s.nextInt(),
                s.nextInt(),
                s.nextInt()
        };

        int cnt = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                cnt++;
            }
        }

        System.out.printf("%d valores pares\n", cnt);

    }

}
