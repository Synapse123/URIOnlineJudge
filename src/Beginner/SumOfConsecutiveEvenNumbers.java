package Beginner;

import java.util.Scanner;

public class SumOfConsecutiveEvenNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(;;){

            int start = s.nextInt();

            if(start == 0){
                break;
            }

            start = (Math.abs(start) % 2 == 1) ? start+1 : start;
            int sum = 0;

            for(int j = 0; j < 5; j++){
                sum += start;
                start += 2;
            }

            System.out.println(sum);

        }

    }

}
