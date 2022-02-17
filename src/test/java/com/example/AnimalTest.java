package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.List;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class AnimalTest {
    private Animal animal;
    private List food;
    private String type;

    @Before
    public void setUp() throws Exception {
        animal = new Animal() {
            @Override
            public int getKittens() {
                return 0; //это не надо
            }
        };
    }

    public AnimalTest(List food, String type) {
        this.food = food;
        this.type = type;
    }

    @Parameterized.Parameters // добавили аннотацию
    public static Object[][] getSumData() {
        return new Object[][] {
                {List.of("Трава", "Различные растения"), "Травоядное"},
                {List.of("Животные", "Птицы", "Рыба"), "Хищник"},
                {List.of(), ""}
        };
    }



    @Test
    public void getFood(){
        try {
            assertEquals(food, animal.getFood(type));
        } catch (Exception e) {
            assertEquals("Неизвестный вид животного, используйте значение Травоядное или Хищник", e.getMessage());
        }
    }
//    @Test
//    public void getVeganFood() throws Exception {
//        assertEquals(List.of("Трава", "Различные растения"), animal.getFood("Травоядное")) ;
//    }

/*    @Test
    public void getMeatFood() {

    }


    @Test
    public void getOtherFood() {

    }

    @Test
    public void getFood() {

    }

    @Test
    public void getFamily() {
    }*/
}