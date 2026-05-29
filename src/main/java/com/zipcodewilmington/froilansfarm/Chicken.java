package com.zipcodewilmington.froilansfarm;

public class Chicken extends Animal implements Produce<Edible> {

    public Chicken(String name, String sound) {
        super(name, sound);
    }

    @Override
    public EdibleEgg yield() {
        return new EdibleEgg();
    }
}