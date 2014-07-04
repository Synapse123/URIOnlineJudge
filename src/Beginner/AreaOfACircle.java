package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class AreaOfACircle {

    public static final double PI = 3.14159;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double r = Double.parseDouble(in.readLine());

        System.out.printf(Locale.US, "A=%.4f\n", r*r*PI);

    }

}