package AdHoc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 22/08/14: ranked nr. 13 (java)

public class Queen {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        for(;;) {

            String[] line = br.readLine().split(" ");
            int x1 = Integer.parseInt(line[0]);
            int y1 = Integer.parseInt(line[1]);
            int x2 = Integer.parseInt(line[2]);
            int y2 = Integer.parseInt(line[3]);

            if(x1 == 0) {
                break;
            }

            if(x1 == x2 && y1 == y2) {
                sb.append("0\n");
            } else if(Math.abs(x1 - x2) == Math.abs(y1 - y2) || x1 == x2 || y1 == y2) {
                sb.append("1\n");
            } else {
                sb.append("2\n");
            }

        }

        System.out.print(sb);

    }

}
