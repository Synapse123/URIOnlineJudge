package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class SalaryIncrease {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double salary = s.nextDouble();

        double newSalary = 0;
        double earned = 0;
        int percentage = 0;

        if(salary >= 0 && salary <= 400){
            percentage = 15;
        }else if(salary > 400 && salary <= 800){
            percentage = 12;
        }else if(salary > 800 && salary <= 1200){
            percentage = 10;
        }else if(salary > 1200 && salary <= 2000){
            percentage = 7;
        }else if(salary > 2000){
            percentage = 4;
        }

        newSalary = salary * (1.0 + percentage/100.0);
        earned = newSalary - salary;

        System.out.printf("Novo salario: %.2f\n", newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", earned);
        System.out.printf("Em percentual: %d %%\n", percentage);

    }

}
