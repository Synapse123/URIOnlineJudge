package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 17/08/14: ranked nr. 7 (java)

public class FitOrDontFitII {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            String[] line = br.readLine().split(" ");

            int aLength = line[0].length();
            int bLength = line[1].length();

            if(aLength < bLength){

                sb.append("nao ");

            }else{

                for(int k = aLength-1, l = bLength-1; l >= 0; k--, l--) {

                    if(line[0].charAt(k) != line[1].charAt(l)){
                        sb.append("nao ");
                        break;
                    }

                }

            }

            sb.append("encaixa\n");

        }

        System.out.print(sb);

    }

}
