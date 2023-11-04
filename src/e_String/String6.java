package e_String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] num = new int[26];

        for (int i = 0; i < num.length; i++) {
            num[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);

            if (num[ch - 'a'] == -1) num[ch - 'a'] = i;
        }
        for (int var : num) {
            System.out.print(var + " ");
        }
    }
}
// charat 이용
// 이건 틀렸다고 보자. 자료물 좀 봤음