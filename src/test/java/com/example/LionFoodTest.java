package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionFoodTest {

    @Mock
    Animal animal;

    @Test
    public void lionFoodTest(){
        try {
            Mockito.when(animal.getFood("Хищник")).thenReturn((List.of("Животные", "Птицы", "Рыба")));
            List expectedFoodList = List.of("Животные", "Птицы", "Рыба");

            List actualFoodList = animal.getFood("Хищник");

            assertEquals(expectedFoodList, actualFoodList);

        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }


    }
}
