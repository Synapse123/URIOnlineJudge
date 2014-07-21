package Beginner;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersIII {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int lines = s.nextInt();

        for(int i = 0; i < lines; i++){

            int start = s.nextInt();
            start = (start % 2 == 0) ? start+1 : start;
            int num = s.nextInt();
            int sum = 0;

            for(int j = 0; j < num; j++){
                sum += start;
                start += 2;
            }

            System.out.println(sum);

        }

    }

}
