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
            String animalKind = "Хищник";
            Lion lion = new Lion(animalKind, (Feline) animal);
            Mockito.when(animal.getFood("Хищник")).thenReturn((List.of("Животные", "Птицы", "Рыба")));
            List expectedFoodList = List.of("Животные", "Птицы", "Рыба");

            List actualFoodList = lion.getFood();

            assertEquals(expectedFoodList, actualFoodList);

        } catch (Exception e) {
            String expectedException = "Неизвестный вид животного, используйте значение Травоядное или Хищник";
            String actualException = e.getMessage();
            assertEquals(expectedException, actualException);
        }

    }
}
