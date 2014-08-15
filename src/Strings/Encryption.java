package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 15/07/14: ranked nr. 8 (java)

public class Encryption {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String line;
        int length;

        for(int i = 0; i < n; i++){

            line = br.readLine();
            length = line.length();

            for(int j = length - 1; j >= 0; j--){

                char c = line.charAt(j);

                if(c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z'){
                    c += 3;
                }
                if(j <= Math.ceil(length/2.0) - 1){
                    c -= 1;
                }

                sb.append(c);

            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
