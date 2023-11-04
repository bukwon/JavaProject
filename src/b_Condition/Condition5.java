package b_Condition;

import java.util.Scanner;

public class Condition5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            int hour = sc.nextInt();
            int minute = sc.nextInt();

            if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59)) {
                minute -= 45;
                if (minute < 0) {
                    minute += 60;
                    hour -= 1;
                    if (hour < 0) hour += 24;
                    System.out.println(hour + " " + minute);
                } else System.out.println(hour + " " + minute);

            }
        }
    }
}
