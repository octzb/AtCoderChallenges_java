package com.github.octzb.AtCoderChallenges.abc088_a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void n5024_a25で割り切れる() {

        boolean actual = Main.isSurplus(5024, 25);
        boolean expected = true;

        assertThat(actual, is(expected));
    }

    @Test
    public void n5024_a20で割り切れない() {

        boolean actual = Main.isSurplus(5024, 20);
        boolean expected = false;

        assertThat(actual, is(expected));
    }
}