package com.github.octzb.AtCoderChallenges.abc081_a;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int counter = getCount(s);
        System.out.println(counter);

    }

    public static int getCount(String s) {
        String array[] = s.split("");

        int count = 0;
        if (array[0].equals("1")) {
            count++;
        }
        if (array[1].equals("1")) {
            count++;
        }
        if (array[2].equals("1")) {
            count++;
        }
        return count;
    }

}
