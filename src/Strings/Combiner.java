package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 13/07/14: ranked nr. 11 (java)

public class Combiner {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            String[] words = br.readLine().split(" ");

            int w1l = words[0].length();
            int w2l = words[1].length();

            boolean equal = (w1l - w2l) == 0;

            int min = w1l;
            int max = w1l;
            int indMax = 0;

            if(!equal){
                if(w1l > w2l){
                    indMax = 0;
                    min = w2l;
                }else{
                    indMax = 1;
                    max = w2l;
                }
            }

            for(int j = 0; j < min; j++){
                sb.append(words[0].charAt(j));
                sb.append(words[1].charAt(j));
            }
            if(!equal){
                sb.append(words[indMax].substring(min));
            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
