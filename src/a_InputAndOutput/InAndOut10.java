package a_InputAndOutput;

import java.util.Scanner;

public class InAndOut10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();
        String num2 = sc.next();
        String[] arr;

        arr = num2.split("");

        for (int i = num2.length() - 1; i >= 0; i--) {
            System.out.println(Integer.parseInt(arr[i])*num1);
        }
        System.out.println(Integer.parseInt(num2) * num1);
    }
}
