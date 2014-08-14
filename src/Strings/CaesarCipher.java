package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 14/07/14: ranked nr. 1 (java)

public class CaesarCipher {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int length;
        int shift;
        String line;

        for(int i = 0; i < n; i++){

            line = br.readLine();
            shift = Integer.parseInt(br.readLine());
            length = line.length();

            for(int j = 0; j < length; j++){

                char c = line.charAt(j);

                if(c >= 'A' + shift && c <= 'Z'){
                    c -= shift;
                }else{
                    c += ('Z' - 'A' + 1) - shift;
                }

                sb.append(c);

            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
