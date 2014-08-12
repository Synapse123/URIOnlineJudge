package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 12/07/14: ranked nr. 2 (java)

public class SquareMatrixI {

    public static void main(String[] args) throws IOException{

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n;
        int x = 1;

        while((n = Integer.parseInt(r.readLine())) > 0){

            for(int i = 1; i <= n; i++){

                for(int j = 1; j <= n; j++){

                    if(j > n-i+1){
                        x--;
                    }

                    int width = (int) Math.log10(x) + 1;

                    for(int k = 0; k < 3 - width; k++){
                        sb.append(" ");
                    }

                    sb.append(x);

                    if(j < i){
                        x++;
                    }

                    if(j < n){
                        sb.append(" ");
                    }

                }

                sb.append("\n");

            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
