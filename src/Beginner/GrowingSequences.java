package Beginner;

import java.util.Scanner;

public class GrowingSequences {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        for(;;){

            int x = s.nextInt();

            if(x == 0){
                break;
            }

            StringBuilder sb = new StringBuilder();

            for(int i = 1; i < x; i++){
                sb.append(i + " ");
            }

            sb.append(x);

            System.out.println(sb.toString());

        }

    }

}
