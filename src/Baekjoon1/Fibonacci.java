package Baekjoon1;

import java.sql.SQLOutput;

public class Fibonacci {
    public static int fibonacci(int n){
        if (n == 0) {
            System.out.println("0");
            return 0;
        } else if (n == 1) {
            System.out.println("1");
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int[][] home = new int[][]{         // 거실
                {0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0,},
                {-1, 0, 0, 0, 0, 0, 0, 0,},
                {-1, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0,},
                {0, 0, 0, 0, 0, 0, 0, 0,}
        };

        System.out.println(home[-1][-1]);
    }
}
