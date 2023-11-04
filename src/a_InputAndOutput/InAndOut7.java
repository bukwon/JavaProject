package a_InputAndOutput;

import java.util.Scanner;

public class InAndOut7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String existId = "dnu05043";

        while(true) {
            String myId = sc.next();
            if (myId.equals(existId)) System.out.println(myId + "??!");
            else {
                System.out.println("잘 입력된 ID");
                break;
            }
        }
    }
}
