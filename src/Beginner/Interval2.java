package Beginner;

import java.util.Scanner;

public class Interval2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int in = 0;
        int out = 0;

        for(int i = 0; i < n; i++){
            int x = s.nextInt();
            if(x >= 10 && x <= 20){
                in++;
            }else{
                out++;
            }
        }

        System.out.printf("%d in\n", in);
        System.out.printf("%d out\n", out);

    }

}
