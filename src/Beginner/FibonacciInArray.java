package Beginner;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Scanner;

public class FibonacciInArray {

    private static HashMap<Integer, BigInteger> fibSeq = new HashMap<Integer, BigInteger>();

    public static void main(String[] args) {

        fibSeq.put(0, BigInteger.ZERO);
        fibSeq.put(1, BigInteger.ONE);

        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        for(int i = 0; i < n; i++){

            int x = s.nextInt();

            System.out.printf("Fib(%d) = %d\n", x, fibonacci(x));

        }

    }

    private static BigInteger fibonacci(int n){

        if(!fibSeq.containsKey(n)){
            fibSeq.put(n, fibonacci(n-1).add(fibonacci(n-2)));
        }

        return fibSeq.get(n);

    }

}
