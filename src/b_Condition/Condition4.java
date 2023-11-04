package b_Condition;

import java.util.Scanner;

public class Condition4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if(x != 0 && y != 0) {
            if (x >= 1 && y >= 1)
                System.out.println(1);
            else if (x < 0 && y >= 1)
                System.out.println(2);
            else if (x < 0 && y < 0)
                System.out.println(3);
            else System.out.println(4);
        }
        else System.out.println("잘못된 입력");
    }
}
