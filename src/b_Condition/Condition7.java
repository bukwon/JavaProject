package b_Condition;

import java.util.Scanner;

public class Condition7 {

    public static int maxValue(int[] dice) {
        int maxValue = 0;
        for (int i = 0; i < dice.length - 1; i++) {
            maxValue = Math.max(dice[i], dice[i + 1]);
        }
        return maxValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] dice = new int[3];

        while(true) {
        // 버블 정렬 이용
        int sameCount = 1;
        int sameValue = 0;
        int price = 0;

        for (int i = 0; i < dice.length; i++) dice[i] = sc.nextInt();

        for (int i = 0; i < dice.length - 1; i++) {
            for (int j = i; j < dice.length; j++) {
                if (i == j) continue;
                if (dice[i] > dice[j]) {
                    int temp = dice[i];
                    dice[i] = dice[j];
                    dice[j] = temp;
                } else if (dice[i] == dice[j]) {
                    sameCount++;
                    sameValue = dice[i];
                    System.out.println("SameCount : " + sameCount);
                }
            }
        }

        System.out.println(maxValue(dice));
        if (sameCount == 1) price = maxValue(dice) * 100;
        else if (sameCount == 2) price = 1000 + sameValue * 100;
        else price = 10000 + sameValue * 1000;

        System.out.println(price);
    }
        }
}