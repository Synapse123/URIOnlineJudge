package Beginner;

import java.util.Scanner;

// 11/07/14: ranked nr. 96 (java)

public class ExceedingZ {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int z;

        for(;;){

            z = s.nextInt();

            if(z > x){
                break;
            }

        }

        int i = 1;
        int sum = x;

        while(sum <= z){

            x++;
            sum += x;
            i++;

        }

        System.out.println(i);

    }

}
