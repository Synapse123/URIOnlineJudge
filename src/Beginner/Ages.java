package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Ages {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int sum = 0;
        int cnt = 0;

        for(;;){

            int age = s.nextInt();

            if(age < 0){
                break;
            }

            sum += age;
            cnt++;

        }

        System.out.printf("%.2f\n", (double) sum / cnt);

    }

}
