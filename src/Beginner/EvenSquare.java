package Beginner;

import java.util.Scanner;

public class EvenSquare {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 2; i <= n; i += 2){
            System.out.printf("%d^2 = %d\n", i, (int) Math.pow(i, 2));
        }

    }

}
