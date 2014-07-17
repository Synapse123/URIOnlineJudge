package Beginner;

import java.util.Scanner;

public class GameTime {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int begin = s.nextInt();
        int end = s.nextInt();

        int duration = 0;

        if(begin > end){
            duration = 24 - begin + end;
        }else{
            duration = end - begin;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", duration);

    }

}
