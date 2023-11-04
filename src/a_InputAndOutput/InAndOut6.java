package a_InputAndOutput;
import java.util.Scanner;

public class InAndOut6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("두 수 입력 : ");
        int num1 = sc.nextInt(), num2 = sc.nextInt();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);
    }
}


    /*두 자연수 A와 B가 주어진다. 이때, A+B, A-B,
    A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오.
    첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.*/