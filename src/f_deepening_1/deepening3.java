package f_deepening_1;

import java.util.Scanner;

public class deepening3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();   // 첫 줄 입력 값
        int rule = 1;
        int count=0;
        int num = 2 * N - 1;

        while (count < num) {
            if (count < N) {
                for (int i = 0; i < N - rule; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 2 * rule - 1; i++) {
                    System.out.print("*");
                }
                System.out.println();
                if(rule < N) rule++;
            }
            if (count >= N && count < num) {
                rule--;
                for (int i = 0; i < N-rule; i++) {
                    System.out.print(" ");
                }
                for (int i = 0; i <2 * rule - 1 ; i++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            count++;
        }
    }
}

// 많이 골앓았던 문제이므로 벨로그에 기록