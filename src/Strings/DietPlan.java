package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

// 23/08/14: ranked nr. 10 (java)

public class DietPlan {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {

            String diet = br.readLine();
            String eaten = br.readLine() + br.readLine();

            if(eaten.length() > diet.length()){
                sb.append("CHEATER\n");
                continue;
            }

            boolean cheater = false;

            for(int j = 0; j < eaten.length(); j++){
                int index = diet.indexOf(eaten.charAt(j));
                if(index >= 0){
                    diet = diet.substring(0, index) + diet.substring(index+1);
                }else{
                    cheater = true;
                    break;
                }
            }

            if(cheater){
                sb.append("CHEATER\n");
                continue;
            }

            char[] leftOver = diet.toCharArray();
            Arrays.sort(leftOver);
            sb.append(leftOver);
            sb.append("\n");

        }

        System.out.print(sb);

    }

}
