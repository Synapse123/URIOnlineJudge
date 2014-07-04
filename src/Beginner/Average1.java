package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Average1 {

    public static final double weight1 = 3.5;
    public static final double weight2 = 7.5;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(in.readLine());
        double b = Double.parseDouble(in.readLine());
        double avg = (a*weight1 + b*weight2) / (weight1 + weight2);

        System.out.printf(Locale.US, "MEDIA = %.5f\n", avg);

    }

}
