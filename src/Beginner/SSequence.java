package Beginner;

import java.util.Locale;

public class SSequence {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double s = 0;

        for(int i = 1; i <= 100; i++){
            s += 1.0/i;
        }

        System.out.printf("%.2f\n", s);

    }

}
