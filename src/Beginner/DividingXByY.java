package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class DividingXByY {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){

            int x = s.nextInt();
            int y = s.nextInt();

            if(y == 0){
                System.out.println("divisao impossivel");
            }else{
                System.out.printf("%.1f\n", (double) x / y);
            }

        }

    }

}
