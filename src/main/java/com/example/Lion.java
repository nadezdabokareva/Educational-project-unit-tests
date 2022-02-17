package com.example;

import java.util.List;

public class Lion extends Animal{

    private Feline feline;
    KittensCount kittensCount;

    boolean hasMane;

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }


    public int getKittens() {
        return kittensCount.getKittens();
    }

    public boolean doesHaveMane(List sex) {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }


}
