package Beginner;

import java.util.Locale;

public class SequentialIJ4 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double i = 0;
        double j = 1;

        while(i <= 2){
            for(int n = 1; n <= 3; n++){
                if(i == Math.round(i)){
                    System.out.printf("I=%.0f ", i);
                }else{
                    System.out.printf("I=%.1f ", i);
                }
                if(j == Math.round(j)){
                    System.out.printf("J=%.0f\n", j);
                }else{
                    System.out.printf("J=%.1f\n", j);
                }
                j += 1;
            }
            i = (double) Math.round((i + 0.2) * 100) / 100;
            j = 1 + i;
        }

    }

}
