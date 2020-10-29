package main.height;

import org.junit.Test;

import static org.junit.Assert.*;

public class adultHeightTest {

    @Test
    public void calcHChildTest() {
        assertEquals(68, adultHeight.calcHChild(1, 69, 73));
        assertEquals(73, adultHeight.calcHChild(0, 69, 73));
    }
}