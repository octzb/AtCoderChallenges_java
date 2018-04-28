package com.github.octzb.AtCoderChallenges.abc086_a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void a3b2で割り切れる() {

        boolean actual = Main.haveSurplus(3, 2);
        boolean expected = false;

        assertThat(actual, is(expected));
    }

    @Test
    public void a30b1で割り切れない() {

        boolean actual = Main.haveSurplus(3, 1);
        boolean expected = true;

        assertThat(actual, is(expected));
    }

}