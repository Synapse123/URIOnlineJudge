package Beginner;

import java.util.Scanner;

public class AscendingAndDescending {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(;;){

            int x = s.nextInt();
            int y = s.nextInt();

            if(x == y){
                break;
            }

            if(x > y){
                System.out.println("Decrescente");
            }else{
                System.out.println("Crescente");
            }

        }

    }

}
