package AdHoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 25/08/14: ranked nr. 13 (java)

public class AlarmClock {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] line;

        while((line = br.readLine().split(" ")) != null) {

            if("0".equals(line[0]) && "0".equals(line[1]) && "0".equals(line[2]) && "0".equals(line[3])) {
                break;
            }

            int h1 = Integer.parseInt(line[0]);
            int m1 = Integer.parseInt(line[1]);
            int h2 = Integer.parseInt(line[2]);
            int m2 = Integer.parseInt(line[3]);

            if(m1 > m2){
                h1++;
            }
            int h = (h1 <= h2) ? h2 - h1 : 24 - h1 + h2;
            int m = (m1 <= m2) ? m2 - m1 : 60 - m1 + m2;

            sb.append((h * 60 + m) + "\n");

        }

        System.out.print(sb);

    }

}
