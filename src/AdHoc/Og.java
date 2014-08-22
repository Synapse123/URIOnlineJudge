package AdHoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 22/08/14: ranked nr. 4 (java)

public class Og {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;

        while((line = br.readLine()) != null){

            int a = 0;
            int b = 0;

            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i+1) == ' '){
                    a = Integer.parseInt(line.substring(0,i+1));
                    b = Integer.parseInt(line.substring(i+2));
                    break;
                }
            }

            if(a == 0){
                break;
            }

            sb.append((a+b) + "\n");

        }

        System.out.print(sb);

    }

}
