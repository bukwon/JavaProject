package f_deepening_1;

import java.util.Scanner;

public class deepening6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int count = 0;

        try {
            for (int i = 0; i < input.length(); i++) {

                if (input.length() - 1 > 0) {
                    if (input.charAt(i) == 'c') {
                        if (input.charAt(i + 1) == '=') i++;
                        else i++;
                    } else if (input.charAt(i) == 'd') {
                        if (input.charAt(i + 1) == 'z') {
                            if (input.charAt(i + 2) == '=') i += 2;
                        } else if (input.charAt(i + 1) == '-') i++;
                    } else if (input.charAt(i) == 'l') {
                        if (input.charAt(i + 1) == 'j') i++;
                    } else if (input.charAt(i) == 'n') {
                        if (input.charAt(i + 1) == 'j') i++;
                    } else if (input.charAt(i) == 's') {
                        if (input.charAt(i + 1) == '=') i++;
                    } else if (input.charAt(i) == 'z') {
                        if (input.charAt(i + 1) == '=') i++;
                    }
                }
                count++;
            }
        } catch (Exception e) {
            System.out.println("런타임 에러입니다.");
        }
        System.out.println(count);
    }
}