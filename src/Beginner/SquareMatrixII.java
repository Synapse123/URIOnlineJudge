package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 11/07/14: ranked nr. 7 (java)

public class SquareMatrixII {

    public static void main(String[] args) throws IOException{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n;
        boolean add = false;

        while((n = Integer.parseInt(r.readLine())) > 0){

            int act = 1;

            for(int i = 0; i < n; i++){

                int actCpy = act;

                for(int j = 0; j < n; j++){

                    if(actCpy == 1){
                        add = true;
                    }

                    if(j != 0){
                        sb.append(" ");
                    }

                    int actWidth = (int) Math.log10(actCpy) + 1;

                    for(int k = 0; k < 3 - actWidth; k++){
                        sb.append(" ");
                    }

                    sb.append(actCpy);

                    if(add){
                        actCpy++;
                    }else{
                        actCpy--;
                    }

                }

                act++;

                add = false;

                sb.append("\n");

            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
