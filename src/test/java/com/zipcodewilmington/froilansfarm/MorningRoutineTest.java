package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class MorningRoutineTest {

    @Test
    void testFroilanCanRideEachHorse() {
        Farm farm = new Farm();
        Farmer froilan = new Farmer("Froilan");

        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                assertDoesNotThrow(() -> froilan.mount(horse));
            }
        }
    }

    @Test
    void testFroilandaCanRideEachHorse() {
        Farm farm = new Farm();
        Pilot froilanda = new Pilot("Froilanda");

        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                assertDoesNotThrow(() -> froilanda.mount(horse));
            }
        }
    }

    @Test
    void testEachHorseCanEatThreeEarCorn() {
        Farm farm = new Farm();

        for (Stable stable : farm.getStables()) {
            for (Horse horse : stable.getHorses()) {
                assertDoesNotThrow(() -> {
                    horse.eat(new EarCorn());
                    horse.eat(new EarCorn());
                    horse.eat(new EarCorn());
                });
            }
        }
    }

    @Test
    void testFroilanCanEatBreakfast() {
        Farmer froilan = new Farmer("Froilan");

        assertDoesNotThrow(() -> {
            froilan.eat(new EarCorn());
            froilan.eat(new Tomato());
            froilan.eat(new Tomato());

            for (int i = 0; i < 5; i++) {
                froilan.eat(new EdibleEgg());
            }
        });
    }

    @Test
    void testFroilandaCanEatBreakfast() {
        Pilot froilanda = new Pilot("Froilanda");

        assertDoesNotThrow(() -> {
            froilanda.eat(new EarCorn());
            froilanda.eat(new EarCorn());
            froilanda.eat(new Tomato());
            froilanda.eat(new EdibleEgg());
            froilanda.eat(new EdibleEgg());
        });
    }
}