package Beginner;

import java.util.Scanner;

public class MultiplesOf13 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        int min = Math.min(x, y);
        int max = Math.max(x, y);

        int sum = 0;

        for(int i = min; i <= max; i++){
            if(i % 13 != 0){
                sum += i;
            }
        }

        System.out.println(sum);

    }

}
