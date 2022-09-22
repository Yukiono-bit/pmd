package com.example.l1;


import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void max_test() {
        assertEquals(100, MainActivity.Max(new int[]{1, 2, 4, 10, 100, -1}));
        assertEquals(-1, MainActivity.Max(new int[]{-3, -1, -30, -2, -10, -1}));
        assertEquals(0, MainActivity.Max(new int[]{0, -1}));
        assertEquals(2, MainActivity.Max(new int[]{2}));
    }

    @Test
    public void min_test() {
        assertEquals(-1, MainActivity.Min(new int[]{1, 2, 4, 10, 100, -1}));
        assertEquals(-30, MainActivity.Min(new int[]{-3, -1, -30, -2, -10, -1}));
        assertEquals(-1, MainActivity.Min(new int[]{0, -1}));
        assertEquals(2, MainActivity.Min(new int[]{2}));
    }
}