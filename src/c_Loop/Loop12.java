package c_Loop;

import java.util.Scanner;

public class Loop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A + B);
        }
    }
}

// 이번 문제는 EoF(End of File) 관한 문제 였다
// 벨로그에 정리하면서 공부해보자
// 이번 파트는 인터넷 참조했음