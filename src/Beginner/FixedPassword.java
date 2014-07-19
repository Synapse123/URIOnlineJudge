package Beginner;

import java.util.Scanner;

public class FixedPassword {

    public static final int password = 2002;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(;;){

            if(s.nextInt() == password){
                System.out.println("Acesso Permitido");
                break;
            }else{
                System.out.println("Senha Invalida");
            }

        }

    }

}
