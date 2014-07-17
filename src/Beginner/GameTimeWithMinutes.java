package Beginner;

import java.util.Scanner;

public class GameTimeWithMinutes {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int beginH = s.nextInt();
        int beginM = s.nextInt();
        int endH = s.nextInt();
        int endM = s.nextInt();

        int durationH = 0;
        int durationM = 0;

        if(beginH > endH){
            durationH = 24 - beginH + endH;
        }else{
            durationH = endH - beginH;
        }
        if(beginM > endM){
            durationH--;
            durationM = 60 - beginM + endM;
        }else{
            durationM = endM - beginM;
        }

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationH, durationM);

    }

}
