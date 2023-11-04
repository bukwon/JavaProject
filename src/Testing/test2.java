package Testing;

import java.util.ArrayList;

public class test2 {
    public static void main(String[] args) {
        long num1 = 1;
        long num2 = 2;   // 첫 번째, 두 번째
        long num3 = 0;   // 세 번째 자리 구하기
        long check = 0;   // 리스트 안에 들어있는 값 짝수 확인 용
        long result = 0; // 짝수 일 시 값 추가

        ArrayList<Long> list = new ArrayList<>();
        list.add(num1);
        list.add(num2);

        System.out.println(list);

        while (true) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            if (num3 >= 50000000) break;
            else list.add(num3);
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            check = list.get(i);
            if (check % 2 == 0) result += check;
        }
        System.out.println(result);
    }
}
