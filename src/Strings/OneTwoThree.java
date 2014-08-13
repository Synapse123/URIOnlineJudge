package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 13/07/14: ranked nr. 6 (java)

public class OneTwoThree {

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            String num = br.readLine();

            if(num.length() == 5){
                sb.append("3\n");
            }else if(num.charAt(0) == 'o' && num.charAt(1) == 'n'
                    || num.charAt(0) == 'o' && num.charAt(2) == 'e'
                    || num.charAt(1) == 'n' && num.charAt(2) == 'e'){
                sb.append("1\n");
            }else{
                sb.append("2\n");
            }

        }

        System.out.print(sb);

    }

}
