package Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class LED {

    public static void main(String[] args) throws IOException{

        HashMap<Character, Integer> LEDs = new HashMap<Character, Integer>();
        LEDs.put('1', 2);
        LEDs.put('2', 5);
        LEDs.put('3', 5);
        LEDs.put('4', 4);
        LEDs.put('5', 5);
        LEDs.put('6', 6);
        LEDs.put('7', 3);
        LEDs.put('8', 7);
        LEDs.put('9', 6);
        LEDs.put('0', 6);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++){

            String number = br.readLine();
            int sum = 0;

            for(int j = 0; j < number.length(); j++){

                sum += LEDs.get(number.charAt(j));

            }

            sb.append(sum + " leds\n");

        }

        System.out.print(sb);

    }

}
