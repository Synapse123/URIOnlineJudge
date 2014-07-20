package Beginner;

import java.util.HashMap;
import java.util.Scanner;

public class SimpleFibonacci {

    private static HashMap<Integer, Integer> mem = new HashMap<Integer, Integer>();

    public static void main(String[] args) {

        mem.put(0, 0);
        mem.put(1, 1);

        Scanner s = new Scanner(System.in);

        System.out.println(fibonacci(s.nextInt()));

    }

    public static int fibonacci(int n){

        if(mem.containsKey(n)){
            return mem.get(n);
        }else{
            mem.put(n, n * fibonacci(n-1));
            return mem.get(n);
        }

    }

}
