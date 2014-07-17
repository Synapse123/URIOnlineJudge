package Beginner;

import java.util.Scanner;

public class SixOddNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int bnd = s.nextInt();
        bnd = (bnd % 2 == 0) ? bnd+1 : bnd;

        for(int i = 0; i < 6; i++){
            System.out.println(bnd);
            bnd += 2;
        }

    }

}
