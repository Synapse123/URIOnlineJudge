package Beginner;

import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){

            int x = s.nextInt();

            if(x == 0){
                System.out.println("NULL");
                continue;
            }

            if(x % 2 == 0){
                System.out.print("EVEN ");
            }else{
                System.out.print("ODD ");
            }

            if(x > 0){
                System.out.println("POSITIVE");
            }else{
                System.out.println("NEGATIVE");
            }

        }

    }

}
