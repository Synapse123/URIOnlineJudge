package Beginner;

public class SequentialIJ3 {

    public static void main(String[] args) {

        int k = 7;
        for(int i = 1; i <= 9; i += 2){
            for(int j = 1; j <= 3; j++){
                System.out.printf("I=%d J=%d\n", i, k);
                k--;
            }
            k += 5;
        }

    }

}
