package com.example;

import java.util.List;

public class Lion implements KittensCount{

    private Feline feline;

    boolean hasMane;

    public Lion(int i, Feline feline){
        this.feline = feline;
    }

    public Lion(String sex, Feline feline) throws Exception {
        this.feline = feline;
        if ("Самец".equals(sex)) {
            hasMane = true;
        } else if ("Самка".equals(sex)) {
            hasMane = false;
        } else {
            throw new Exception("Используйте допустимые значения пола животного - самей или самка");
        }
    }

    @Override
    public int getKittens() {
        return getKittens(1);
    }

    @Override
    public int getKittens(int kittensCount){
        return kittensCount;
    }

    public boolean doesHaveMane(List sex) {
        return hasMane;
    }

    public List<String> getFood() throws Exception {
        return feline.getFood("Хищник");
    }


}
