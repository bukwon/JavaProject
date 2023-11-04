package c_Loop;
    //다시보기 !!!! 복습 !!


import java.util.ArrayList;
import java.util.Scanner;

public class Loop11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> array = new ArrayList<>();
        int num = 0;


        while (true) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            if (A == 0 && B == 0) break;
            array.add(A+B);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
    }
}

// 이 부분 다시 보기 중요 !!!
// 자바 동적 배열에 관해 다시 정리 !!
// 객체 생성, 원소 접근 등등
// 동적 배열 단점 - 쓰레드에 안전 X, Vector가 쓰레드에 안전