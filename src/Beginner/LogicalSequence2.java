package Beginner;

import java.util.Scanner;

// Scored performance rank 13
public class LogicalSequence2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int x = s.nextInt();
        int y = s.nextInt();

        StringBuilder sb = new StringBuilder();

        int j = 1;

        for(int i = 1; i < y; i++){
            sb.append(i);
            if(j == x){
                j = 1;
                sb.append("\n");
            }else{
                j++;
                sb.append(" ");
            }
        }

        sb.append(y);

        System.out.println(sb);

    }

}
