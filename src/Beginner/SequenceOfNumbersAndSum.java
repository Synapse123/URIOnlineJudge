package Beginner;

import java.util.Scanner;

public class SequenceOfNumbersAndSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(;;){

            int x = s.nextInt();
            int y = s.nextInt();

            if(x <= 0 || y <= 0){
                break;
            }

            int min = Math.min(x, y);
            int max = Math.max(x, y);

            int sum = 0;

            for(int i = min; i <= max; i++){
                sum += i;
                System.out.printf("%d ", i);
            }

            System.out.printf("Sum=%d\n", sum);

        }

    }

}
