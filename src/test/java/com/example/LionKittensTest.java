package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LionKittensTest {

    private Feline feline;

    @Test
    public void lionKittensCountTest() throws Exception {
        Lion lion = new Lion(feline);
        int expectedKittensCount = 1;

        int actualKittensCount = lion.getKittens();
        assertEquals(expectedKittensCount, actualKittensCount);
    }
}
