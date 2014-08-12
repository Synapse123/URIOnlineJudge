package Beginner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 12/07/14: ranked nr. 5 (java)

public class BuildingHouses {

    public static void main(String[] args) throws IOException {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String line;

        while((line = r.readLine()) != null && !"0".equals(line)){

            String[] dataS = line.split(" ");

            int[] data = { Integer.parseInt(dataS[0]), Integer.parseInt(dataS[1]), Integer.parseInt(dataS[2]) };

            int houseArea = data[0] * data[1];

            int landArea = houseArea * 100 / data[2];

            sb.append(((int) Math.sqrt(landArea)) + "\n");

        }

        System.out.print(sb);

    }

}
