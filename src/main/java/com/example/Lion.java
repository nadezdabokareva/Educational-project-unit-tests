package com.example;

import java.util.List;

public class Lion implements KittensCount{

    private Feline feline;

    boolean hasMane;

    public Lion(Feline feline){
        this.feline = this.feline;
    }

    public Lion(String sex, Animal feline) throws Exception {
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
