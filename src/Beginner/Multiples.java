package Beginner;

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int b = s.nextInt();

        int max = Math.max(a, b);
        int min = Math.min(a, b);

        if(max % min == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }

    }

}
