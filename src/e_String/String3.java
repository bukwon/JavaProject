package e_String;

import java.util.Scanner;

public class String3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int last = 0;
        String[] word;
        for (int i = 0; i < T; i++) {
            String S = sc.next();
            word = S.split("");
            last = word.length;
            System.out.println(word[0] + word[last-1]);
        }
    }
}
