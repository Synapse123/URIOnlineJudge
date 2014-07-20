package Beginner;

import java.util.Scanner;

public class EasyFibonacci {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int i = 0;
        int j = 1;

        if(n == 1){
            System.out.println(i);
        }else if(n == 2){
            System.out.println(i + " " + j);
        }else{
            System.out.print(i + " " + j);
            for(int k = 3; k <= n; k++){
                int sum = i + j;
                System.out.print(" " + sum);
                i = j;
                j = sum;
            }
            System.out.println();
        }

    }

}
