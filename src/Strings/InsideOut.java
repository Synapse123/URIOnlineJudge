package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 13/07/14: ranked nr. 8 (java)

public class InsideOut {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            String line = br.readLine();
            int length = line.length();

            for(int j = length/2-1; j >= 0; j--){
                sb.append(line.charAt(j));
            }
            for(int j = length-1; j >= length/2; j--){
                sb.append(line.charAt(j));
            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
