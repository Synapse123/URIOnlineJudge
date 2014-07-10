package Beginner;

import java.util.Scanner;

public class Banknotes {

    public static final int[] banknotes = {100, 50, 20, 10, 5, 2, 1};

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int amount = s.nextInt();

        System.out.printf("%d\n", amount);

        int[] amountOfBanknotes = new int[banknotes.length];

        for(int i = 0; i < banknotes.length; i++){
            amountOfBanknotes[i] = amount / banknotes[i];
            amount -= amountOfBanknotes[i] * banknotes[i];
            System.out.printf("%d nota(s) de R$ %d,00\n", amountOfBanknotes[i], banknotes[i]);
        }

    }

}
