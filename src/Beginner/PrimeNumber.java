package Beginner;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int lines = s.nextInt();

        for(int i = 0; i < lines; i++){

            int x = s.nextInt();

            if(isPrime(x)){
                System.out.println(x + " eh primo");
            }else{
                System.out.println(x + " nao eh primo");
            }

        }

    }

    private static boolean isPrime(int x){

        for(int i = 2; i < x/2 + 1; i++){
            if(x % i == 0){
                return false;
            }
        }

        return true;

    }

}
