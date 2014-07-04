package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleSum {

    public static void main(String[] args) throws IOException{

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(in.readLine());
        int b = Integer.parseInt(in.readLine());

        System.out.printf("SOMA = %d\n", a+b);

    }

}
