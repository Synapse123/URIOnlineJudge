package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 17/08/14: ranked nr. 5 (java)

public class Justifier {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean first = true;

        for(;;){

            int n = Integer.parseInt(br.readLine());

            if(n == 0){
                break;
            }

            if(!first){
                sb.append("\n");
            }else{
                first = false;
            }

            String[] lines = new String[n];
            int max = 0;

            for(int i = 0; i < n; i++){
                String line = br.readLine();
                int length = line.length();
                lines[i] = line;
                max = length > max ? length : max;
            }

            for(int i = 0; i < n; i++){
                for(int j = 0; j < max - lines[i].length(); j++){
                    sb.append(" ");
                }
                sb.append(lines[i] + "\n");
            }

        }

        System.out.print(sb);

    }

}
