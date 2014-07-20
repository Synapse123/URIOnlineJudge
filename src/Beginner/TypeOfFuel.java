package Beginner;

import java.util.Scanner;

public class TypeOfFuel {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int alcohol = 0;
        int gasoline = 0;
        int diesel = 0;

        for(;;){

            int code = s.nextInt();

            if(code == 1){
                alcohol++;
            }else if(code == 2){
                gasoline++;
            }else if(code == 3){
                diesel++;
            }else if(code == 4){
                break;
            }

        }

        System.out.println("MUITO OBRIGADO");
        System.out.printf("Alcool: %d\n", alcohol);
        System.out.printf("Gasolina: %d\n", gasoline);
        System.out.printf("Diesel: %d\n", diesel);

    }

}
