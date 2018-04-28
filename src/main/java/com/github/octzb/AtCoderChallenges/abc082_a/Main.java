package com.github.octzb.AtCoderChallenges.abc082_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(calcAveRoundUp(a, b));

    }

    public static double calcAveRoundUp(int a, int b) {
        return Math.ceil(((double) a + (double) b) / 2);
    }
}
