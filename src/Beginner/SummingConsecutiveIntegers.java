package Beginner;

import java.util.Scanner;

public class SummingConsecutiveIntegers {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        int n = s.nextInt();

        while(n <= 0){
            n = s.nextInt();
        }

        int sum = 0;

        for(int i = a; i < a+n; i++){
            sum += i;
        }

        System.out.println(sum);

    }

}
