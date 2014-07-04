package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Average2 {

    public static final double weight1 = 2.0;
    public static final double weight2 = 3.0;
    public static final double weight3 = 5.0;

    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        double a = Double.parseDouble(in.readLine());
        double b = Double.parseDouble(in.readLine());
        double c = Double.parseDouble(in.readLine());
        double avg = (a*weight1 + b*weight2 + c*weight3) / (weight1 + weight2 + weight3);

        System.out.printf(Locale.US, "MEDIA = %.1f\n", avg);

    }

}
