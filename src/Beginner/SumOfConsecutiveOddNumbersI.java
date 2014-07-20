package Beginner;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersI {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int sum = 0;

        for(int i = min+1; i < max; i++){
            if(i % 2 != 0){
                sum += i;
            }
        }

        System.out.println(sum);

    }

}
