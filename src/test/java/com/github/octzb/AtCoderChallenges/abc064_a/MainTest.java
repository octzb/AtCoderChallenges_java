package com.github.octzb.AtCoderChallenges.abc064_a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void r4g3b2は4で割り切れる() {

        boolean actual = Main.haveSurplus(4, 3, 2);
        boolean expected = true;

        assertThat(actual, is(expected));
    }

    @Test
    public void r2g3b4は4で割り切れない() {

        boolean actual = Main.haveSurplus(2, 3, 4);
        boolean expected = false;

        assertThat(actual, is(expected));
    }

}