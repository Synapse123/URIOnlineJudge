package Beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DDD {

    public static void main(String[] args) {

        Map<Integer, String> ddd = new HashMap<Integer, String>();
        ddd.put(61, "Brasilia");
        ddd.put(71, "Salvador");
        ddd.put(11, "Sao Paulo");
        ddd.put(21, "Rio de Janeiro");
        ddd.put(32, "Juiz de Fora");
        ddd.put(19, "Campinas");
        ddd.put(27, "Vitoria");
        ddd.put(31, "Belo Horizonte");

        Scanner s = new Scanner(System.in);

        int code = s.nextInt();

        if(ddd.containsKey(code)){
            System.out.println(ddd.get(code));
        }else{
            System.out.println("DDD nao cadastrado");
        }

    }

}
