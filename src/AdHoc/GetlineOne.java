package AdHoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

// 22/08/14: ranked nr. 12 (java)

public class GetlineOne {

    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.US);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line;
        boolean num = false;
        double sum = 0;
        double cnt = 0;

        while((line = br.readLine()) != null && line.length() > 0){

            if(num){
                sum += Integer.parseInt(line);
                cnt++;
            }

            num = !num;

        }

        System.out.printf("%.1f\n", sum / cnt);

    }

}
