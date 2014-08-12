package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class PopulationIncrease {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();

        int n = s.nextInt();

        for(int i = 0; i < n; i++){

            double pa = s.nextDouble();
            double pb = s.nextDouble();

            double g1 = s.nextDouble();
            double g2 = s.nextDouble();

            int years = 0;

            while(pa <= pb && years <= 100){
                pa = (int) (pa * (1 + g1 / 100));
                pb = (int) (pb * (1 + g2 / 100));
                years++;
            }

            if(years > 100){
                sb.append("Mais de 1 seculo.\n");
            }else{
                sb.append(years + " anos.\n");
            }

        }

        System.out.print(sb);

    }

}
