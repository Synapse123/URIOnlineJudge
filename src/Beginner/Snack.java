package Beginner;

import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

public class Snack {

    private static final HashMap<Integer, Double> priceList = new HashMap<Integer, Double>();

    public static void main(String[] args) {

        priceList.put(1, 4.0);
        priceList.put(2, 4.5);
        priceList.put(3,5.0);
        priceList.put(4,2.0);
        priceList.put(5,1.5);

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        int code = s.nextInt();
        int amount = s.nextInt();

        System.out.printf("Total: R$ %.2f\n", priceList.get(code)*amount);

    }

}
