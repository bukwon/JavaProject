package d_Array;

import java.util.Scanner;

public class Array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] n = new int[28];
        int[] check = new int[30];
        int submit = 0;

        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < 30; i++) {
            check[i] = i + 1;
            for (int j = 0; j < n.length; j++) {
                if (check[i] == n[j]) submit++;
            }
            if (submit == 0) System.out.println(check[i]);
            submit = 0;
        }
    }
}

// 이 문제 정리하자. 조금 햇갈렸음. 이중 for문을 써서 두 번째 for문에선 명단에 없는 학생 검사