package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double salary = s.nextDouble();
        double toPay = 0;

        if(salary <= 2000){
            System.out.println("Isento");
        }else if(salary > 2000 && salary <= 3000){
            toPay = (salary - 2000) * 0.08;
        }else if(salary > 3000 && salary <= 4500){
            toPay = 1000 * 0.08 + (salary - 3000) * 0.18;
        }else{
            toPay = 1000 * 0.08 + 1500 * 0.18 + (salary - 4500) * 0.28;
        }

        System.out.printf("R$ %.2f\n", toPay);

    }

}
