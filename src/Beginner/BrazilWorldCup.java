package Beginner;

import java.util.Scanner;

// 11/07/14: ranked nr. 41 (java)

public class BrazilWorldCup {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        while(s.hasNextInt()){

            int x = s.nextInt();

            if(x == 0){
                System.out.println("vai ter copa!");
            }else{
                System.out.println("vai ter duas!");
            }

        }

    }

}
