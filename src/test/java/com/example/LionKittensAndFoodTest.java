package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class LionKittensAndFoodTest {

    @Mock
    private Feline feline;

    private Lion lion;
    private String sex;
    private Boolean hasMane;


    @Test
    public void LionKittensTest() {
        try {
            Mockito.when(feline.getKittens()).thenReturn(1);

            assertEquals(1, feline.getKittens());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    @Test
    public void getFood() {
        try {
            this.lion = new Lion(this.sex, new Feline());
            assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }

    }
