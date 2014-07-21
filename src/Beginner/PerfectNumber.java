package Beginner;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int lines = s.nextInt();

        for(int i = 0; i < lines; i++){

            int n = s.nextInt();
            int sum = 0;

            for(int j = 1; j < n; j++){
                if(n % j == 0){
                    sum += j;
                }
            }

            if(sum == n){
                System.out.println(n + " eh perfeito");
            }else{
                System.out.println(n + " nao eh perfeito");
            }

        }

    }

}
