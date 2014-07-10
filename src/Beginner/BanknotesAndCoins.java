package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class BanknotesAndCoins {

    public static final double[] notesAndCoins = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double value = s.nextDouble();
        int[] amounts = new int[notesAndCoins.length];

        System.out.println("NOTAS:");
        for(int i = 0; i < notesAndCoins.length; i++){
            amounts[i] = (int) (value / notesAndCoins[i]);
            value -= amounts[i] * notesAndCoins[i];
            if(notesAndCoins[i] == 1){
                System.out.println("MOEDAS:");
            }
            System.out.printf("%d %s(s) de R$ %.2f\n", amounts[i], (notesAndCoins[i] > 1) ? "nota" : "moeda",
                    notesAndCoins[i]);
        }

    }

}
