package Beginner;

import java.util.Scanner;

public class SumOfConsecutiveOddNumbersII {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){

            int a = s.nextInt();
            int b = s.nextInt();

            int min = Math.min(a, b);
            int max = Math.max(a, b);

            int sum = 0;

            for(int j = min+1; j < max; j++){
                if(j % 2 != 0){
                    sum += j;
                }
            }

            System.out.println(sum);

        }

    }

}
