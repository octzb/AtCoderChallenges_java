package com.github.octzb.AtCoderChallenges.abc081_a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void s101は2() {

        int actual = Main.getCount("101");
        int expected = 2;

        assertThat(actual, is(expected));
    }

    @Test
    public void s100は1() {

        int actual = Main.getCount("100");
        int expected = 1;

        assertThat(actual, is(expected));
    }

}