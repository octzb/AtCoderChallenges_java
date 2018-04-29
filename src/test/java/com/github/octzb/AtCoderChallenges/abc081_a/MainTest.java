package com.github.octzb.AtCoderChallenges.abc081_a;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MainTest {

    @Test
    public void a3b4はEvenなのでfalse() {

        boolean actual = Main.isOdd(3, 4);
        boolean expected = false;

        assertThat(actual, is(expected));
    }

    @Test
    public void a1b21はOddなのでTrue() {

        boolean actual = Main.isOdd(1, 21);
        boolean expected = true;

        assertThat(actual, is(expected));
    }

}