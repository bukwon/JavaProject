package f_deepening_1;

import java.util.Scanner;

public class deepening4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();

        StringBuffer st = new StringBuffer(word);
        String stReversed = st.reverse().toString();

        if(word.equals(stReversed)) System.out.println(1);
        else System.out.println(0);
    }
}
