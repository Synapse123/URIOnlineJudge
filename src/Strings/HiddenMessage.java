package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 18/08/14: ranked nr. 2 (java)

public class HiddenMessage {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            String line = br.readLine();
            int length = line.length();
            boolean space = true;

            for(int j = 0; j < length; j++){

                char c = line.charAt(j);

                if(c == ' '){
                    space = true;
                }else{
                    if(space){
                        sb.append(c);
                    }
                    space = false;
                }

            }

            sb.append("\n");

        }

        System.out.print(sb);

    }

}
