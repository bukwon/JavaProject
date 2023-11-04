package Baekjoon1;

import static java.lang.Math.random;

import java.util.Random;

/*      {0, 0, 0, 0, 0, 0, 0, 0,},
        {0, 0, 0, 0, 0, 0, 0, 0,},
        {-1, 0, 0, 0, 0, 0, 0, 0,},
        {-1, 0, 0, 0, 0, 0, 0, 0,},
        {0, 0, 0, 0, 0, 0, 0, 0,},
        {0, 0, 0, 0, 0, 0, 0, 0,},
        {0, 0, 0, 0, 0, 0, 0, 0,}   */

// 해당 없는 위치는 움직이지 않는다.


public class DustAir {
    static int R = 7;
    static int C = 8;
    static int[][] home = new int[][]{         // 거실
            {0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0,},
            {-1, 0, 0, 0, 0, 0, 0, 0,},
            {-1, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0,},
            {0, 0, 0, 0, 0, 0, 0, 0,}
    };

    public static void topSetting(int home[][]) {

    }


    public static void main(String[] args) {
        Random random = new Random();   // 거실에 만들 미세먼지 양 랜덤
        double dustAmount;     // 미세먼지 양
        int flowTime = 0;       // 시간의 흐름

        System.out.println();

        for (int i = 0; i < home.length; i++) {
            for (int j = 0; j < home[i].length; j++) {
                double randomBox = (int) (random() * (100 - 1 + 1) + 1);    // 한 공간에 미세먼지 있을 확률
                if (randomBox > 85.0) {
                    if (home[i][j] != -1) {
                        dustAmount = (int) (random() * (80 - 1 + 1) + 1);    // 한 공간에 미세먼지 랜덤 배치
                        home[i][j] = (int) dustAmount;
                    }
                }
                System.out.print(" " + home[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        while (flowTime < 1) {       // 1초 확산
            int zeroCount = 0;      // 미세먼지 네 방향 0 있는자리 조사
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            flowTime++;
            for (int i = 0; i < home.length; i++) {
                for (int j = 0; j < home[i].length; j++) {
                    if (home[i][j] > 30) {
                        if (i == 0) {               // 맨 위 기준
                            if (j == 0) {
                                home[i + 1][j] += 1;
                                home[i][j + 1] += 1;
                                home[i][j] -= 2;
                            }                    // 맨 위의 구석 기준
                            else if (j == 7) {
                                home[i][j - 1] += 1;
                                home[i + 1][j] += 1;
                                home[i][j] -= 2;        // 맨 오른쪽 기준
                            } else {
                                home[i + 1][j] += 1;
                                home[i][j + 1] += 1;
                                home[i][j - 1] += 1;
                                home[i][j] -= 3;        // 단순한 맨 위
                            }
                        } else if (i == 6) {           // 맨 아래 기준
                            if (j == 0) {
                                home[i - 1][j] += 1;
                                home[i][j + 1] += 1;
                                home[i][j] -= 2;
                            }                           // 맨 아래 왼쪽 기준
                            else if (j == 7) {
                                home[i - 1][j] += 1;
                                home[i][j - 1] += 1;
                                home[i][j] -= 2;        // 맨 오른쪽 기준
                            } else {
                                home[i - 1][j] += 1;
                                home[i][j + 1] += 1;
                                home[i][j - 1] += 1;
                                home[i][j] -= 3;        // 단순한 맨 아래
                            }
                        } else if (j == 0 && (i >= 1 && j <= 5)) {          // 맨 왼쪽 벽 기준, 벽 두 구석은 위에서 이미 처리
                            home[i - 1][j] += 1;
                            home[i + 1][j] += 1;
                            home[i][j + 1] += 1;
                            home[i][j] -= 3;
                        } else if (j == 7 && (i >= 1 && j <= 5)) {          // 맨 오른쪽 벽 기준, 맨 벽 두 구석은 위에서 이미 처리
                            home[i + 1][j] += 1;
                            home[i - 1][j] += 1;
                            home[i][j - 1] += 1;
                            home[i][j] -= 3;
                        } else if ((i >= 1 && i <= 5) && (j >= 1 && j <= 6)) {                                         // 나머지 가운데 처리
                            home[i + 1][j] += 1;
                            home[i - 1][j] += 1;
                            home[i][j - 1] += 1;
                            home[i][j + 1] += 1;
                            home[i][j] -= 4;
                        }
                    }
                }
            }
        }
        System.out.println(flowTime);
        for (int i = 0; i < home.length; i++) {
            for (int j = 0; j < home[i].length; j++) {
                System.out.print(" " + home[i][j] + " ");
            }
            System.out.println();
        }
    }
}


// 맵 미세먼지 확산할 때 모서리와 벽면 고려
// https://www.acmicpc.net/problem/17144