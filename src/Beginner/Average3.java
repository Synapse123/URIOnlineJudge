package Beginner;

import java.util.Locale;
import java.util.Scanner;

public class Average3 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner s = new Scanner(System.in);

        double score1 = s.nextDouble();
        double score2 = s.nextDouble();
        double score3 = s.nextDouble();
        double score4 = s.nextDouble();

        double avg = (score1 * 2 + score2 * 3 + score3 * 4 + score4) / 10;

        System.out.printf("Media: %.1f\n", avg);

        if(avg >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(avg < 5.0){
            System.out.println("Aluno reprovado.");
        }else{
            System.out.println("Aluno em exame.");

            double score5 = s.nextDouble();

            System.out.printf("Nota do exame: %.1f\n", score5);

            avg = (avg + score5) / 2;

            if(avg >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f\n", avg);
        }

    }

}
