package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;

public class FarmTest {

    @Test
    void farmHasOneField() {
        Farm farm = new Farm();

        assertNotNull(farm.getField());
    }

    @Test
    void farmHasThreeStables() {
        Farm farm = new Farm();

        assertEquals(3, farm.getStables().size());
    }

    @Test
    void farmHasTenHorses() {
        Farm farm = new Farm();
        int horseCount = 0;
        for (Stable stable : farm.getStables()) {
            horseCount += stable.getHorses().size();
        }
        assertEquals(10, horseCount);
    }

    @Test
    void farmHasFourChickenCoops() {
        Farm farm = new Farm();
        assertEquals(4, farm.getChickenCoops().size());
    }

    @Test
    void farmHasFifteenChickens() {
        Farm farm = new Farm();
        int chickenCount = 0;
        for (ChickenCoop coop : farm.getChickenCoops()) {
            chickenCount += coop.getChickens().size();
        }
        assertEquals(15, chickenCount);
    }

    @Test
    void farmHasOneFarmHouse() {
        Farm farm = new Farm();
        assertNotNull(farm.getFarmHouse());
    }
}