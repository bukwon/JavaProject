package a_InputAndOutput;

import java.util.Scanner;

public class InAndOut11 {                   // 이 파트는 다시 공부하자
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();

        System.out.println(A+B+C);


//        Scanner sc = new Scanner(System.in);
//        int result = 0;
//        String num = sc.nextLine();     // next 와 nextLine의 차이점은 공백 유무이다. 후자는 공백 입력도 받을 수 있음
//        String[] arr = num.split("\\s");
//        for (int i = 0; i < arr.length; i++) {
//            result += Integer.parseInt(arr[i]);
//        }
//        System.out.println(result);
    }
}
