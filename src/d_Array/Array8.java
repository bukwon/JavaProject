package d_Array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            int count = 10;
            List<Integer> list = new ArrayList<>();

            for (int i = 0; i < 10; i++) {
                int num = sc.nextInt();
                num %= 42;
                list.add(num);
            }

            for (int i = 0; i < list.size(); i++) {
                for (int j = i; j < list.size(); j++) {
                    if (i == j) continue;
                    if (list.get(i) == list.get(j)) {
                        list.set(j, -1);
                    }
                }
            }

            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == -1) count--;
            }
            System.out.println(count);
        }
    }
}

// 아싸 드디어 맞았다 !!!!!!! 이건 백준에 꼭 올리도록
// 처음 풀었을 때와 지금 풀었을 때 비교!! (list 사용해서 함)