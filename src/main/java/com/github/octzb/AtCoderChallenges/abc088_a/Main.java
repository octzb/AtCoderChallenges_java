package com.github.octzb.AtCoderChallenges.abc088_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a = sc.nextInt();

        System.out.println(isSurplus(n, a) ? "Yes" : "No");

    }

    public static boolean isSurplus(int n, int a) {
        return n % 500 - a < 0;
    }
}
