package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 15/08/14: ranked nr. 4 (java)

public class DancingSentence {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;
        int length;
        boolean up;

        while((line = br.readLine()) != null && line.length() > 0){

            up = true;
            length = line.length();

            for(int i = 0; i < length; i++){

                char c = line.charAt(i);

                if(Character.isLetter(c)){
                    c = up ? Character.toUpperCase(c) : Character.toLowerCase(c);
                    up = !up;
                }

                sb.append(c);

            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
