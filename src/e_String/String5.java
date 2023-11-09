package e_String;

import java.util.Scanner;

public class String5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int N = sc.nextInt();
            int result = 0;
            String[] M = new String[N];
            String num = sc.next();
            M = num.split("");

            for (int i = 0; i < N; i++) {
                result += Integer.parseInt(M[i]);
            }
            System.out.println(result);

        }
    }
}
// 백준 11720번 문제
// N개 숫자가 공백 없이 쓰여있고 이 숫자들 모두 합해서 출력하는 프로그램
// 구분은 String 형태로 입력 받고 공백 없는 기준은 split을 이용해 해결.
// 공백이 없는 숫자를 따져봐야 했기에 좀 햇갈렸다. 나중에 벨로그에 정리