package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class CatFoodTest {

    @Mock
    Feline feline;

    @Test
    public void getFoodTest () {
        try {
            Cat cat = new Cat(feline);
            Mockito.when(feline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            List expectedFoodList = List.of("Животные", "Птицы", "Рыба");

            List actualFoodList = cat.getFood();
            assertEquals(expectedFoodList, actualFoodList);
        }
        catch (Exception e){
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }

}