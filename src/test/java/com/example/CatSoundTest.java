package com.example;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatSoundTest {
    @Test
    public void getSound() {
        Cat cat = new Cat(new Feline());
        String expectedCatSound = "Мяу";

        String actualCatSound = cat.getSound();
        assertEquals(expectedCatSound, actualCatSound);
    }

}
