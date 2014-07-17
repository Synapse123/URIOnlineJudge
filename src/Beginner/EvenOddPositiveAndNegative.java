package Beginner;

import java.util.Scanner;

public class EvenOddPositiveAndNegative {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] input = {
                s.nextInt(),
                s.nextInt(),
                s.nextInt(),
                s.nextInt(),
                s.nextInt()
        };

        int even = 0;
        int odd = 0;
        int pos = 0;
        int neg = 0;

        for(int i = 0; i < input.length; i++){
            if(input[i] % 2 == 0){
                even++;
            }else{
                odd++;
            }
            if(input[i] > 0){
                pos++;
            }else if(input[i] < 0){
                neg++;
            }
        }

        System.out.printf("%d valor(es) par(es)\n", even);
        System.out.printf("%d valor(es) impar(es)\n", odd);
        System.out.printf("%d valor(es) positivo(s)\n", pos);
        System.out.printf("%d valor(es) negativo(s)\n", neg);

    }

}
