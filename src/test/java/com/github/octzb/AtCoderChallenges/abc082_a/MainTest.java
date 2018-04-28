package com.github.octzb.AtCoderChallenges.abc082_a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void a1b2_2() {

        double actual = Main.calcAveRoundUp(1, 2);
        int expected = 2;

        assertThat((int) actual, is(expected));
    }

    @Test
    public void a7b4_5() {

        double actual = Main.calcAveRoundUp(7, 4);
        int expected = 6;

        assertThat((int) actual, is(expected));
    }

}