package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Collections;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class LionSexTest {
    private Lion lion;
    private String sex;
    private Boolean hasMane;

    public LionSexTest(String sex, Boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][]{
                {"Самец", Boolean.TRUE},
                {"Самка", Boolean.FALSE},
                {"", Boolean.FALSE}
        };
    }

    @Test
    public void LionSexTest() {
        try {
            this.lion = new Lion(this.sex, new Feline());
            assertEquals(hasMane, lion.doesHaveMane(Collections.singletonList(hasMane)));
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }

    }
}
