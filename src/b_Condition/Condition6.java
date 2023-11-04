package b_Condition;

import java.util.Scanner;

public class Condition6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hour = sc.nextInt();
        int minute = sc.nextInt();

        int cookTime = sc.nextInt();

        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (cookTime >= 0 && cookTime <= 1000)) {
            minute += cookTime;
            if (minute > 59) {
                while (true) {
                    if (minute >= 60) {
                        minute -= 60;
                        hour += 1;
                    } else break;
                }
            }
            if (hour >= 24) {
                hour -= 24;
            }                   // ***
        }
        System.out.println(hour + " " + minute);
    }
}

// 40 += 40 == 1 20

// 시간 24시 되면 0으로 해주면 안된다. 그래서 틀린거다.
// 수정 전(***) hour = 0,  수정 후(***) hour -= 24