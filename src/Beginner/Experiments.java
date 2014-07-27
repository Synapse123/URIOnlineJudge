package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Experiments {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int sumC = 0;
        int sumR = 0;
        int sumS = 0;

        for(int i = 0; i < n; i++){

            int amount = s.nextInt();
            String type = (s.nextLine()).substring(1);

            if(type.equals("C")){
                sumC += amount;
            }else if(type.equals("R")){
                sumR += amount;
            }else if(type.equals("S")){
                sumS += amount;
            }

        }

        int sumTotal = sumC + sumR + sumS;

        System.out.printf("Total: %d cobaias\n", sumTotal);
        System.out.printf("Total de coelhos: %d\n", sumC);
        System.out.printf("Total de ratos: %d\n", sumR);
        System.out.printf("Total de sapos: %d\n", sumS);
        System.out.printf("Percentual de coelhos: %.2f %%\n", (double) 100 * sumC / sumTotal);
        System.out.printf("Percentual de ratos: %.2f %%\n", (double) 100 * sumR / sumTotal);
        System.out.printf("Percentual de sapos: %.2f %%\n", (double) 100 * sumS / sumTotal);

    }

}
