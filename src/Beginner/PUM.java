package Beginner;

import java.util.Scanner;

public class PUM {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int x = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(x + " ");
                x++;
                if(j == 2) {
                    System.out.println("PUM");
                    x++;
                }
            }
        }

    }

}
