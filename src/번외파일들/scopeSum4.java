package 번외파일들;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class scopeSum4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf =
                new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =
                new StringTokenizer(bf.readLine());
        int suNo = Integer.parseInt(st.nextToken()); // 총 입력 값
        int quizNo = Integer.parseInt(st.nextToken()); // 시도 횟수
        long[] S = new long[suNo + 1];

        st = new StringTokenizer(bf.readLine());
        for (int i = 1; i <= suNo; i++) {
            S[i] = S[i - 1] + Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < quizNo; i++) {
            st = new StringTokenizer(bf.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());
            System.out.println(S[num2] - S[num1 - 1]);
        }
    }
}