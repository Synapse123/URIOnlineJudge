package Beginner;

import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String one = s.nextLine();
        String two = s.nextLine();
        String three = s.nextLine();

        if(one.equals("vertebrado")){
            if(two.equals("ave")){
                if(three.equals("carnivoro")){
                    System.out.println("aguia");
                }else if(three.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if(two.equals("mamifero")){
                if(three.equals("onivoro")){
                    System.out.println("homem");
                }else if(three.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else{
            if(two.equals("inseto")){
                if(three.equals("hematofago")){
                    System.out.println("pulga");
                }else if(three.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if(two.equals("anelideo")){
                if(three.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(three.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }

    }

}
