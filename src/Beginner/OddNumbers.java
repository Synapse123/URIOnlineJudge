package Beginner;

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int bnd = s.nextInt();

        for(int i = 1; i <= bnd; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }

    }

}
