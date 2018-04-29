package com.github.octzb.AtCoderChallenges.abc081_a;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(isOdd(a, b) ? "Odd" : "Even");

    }

    public static boolean isOdd(int a, int b) {
        return a * b % 2 != 0;
    }

}
