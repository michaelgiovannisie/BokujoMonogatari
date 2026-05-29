package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WednesdayTest {

    private Chicken chicken;

    @BeforeEach
    void setUp() {
        chicken = new Chicken("Chicken");
    }

    @Test
    void chickenCanYieldEgg() {
        Edible egg = chicken.yield();
        assertTrue(egg instanceof EdibleEgg);
    }

    @Test
    void chickenCanMakeNoise() {
        assertDoesNotThrow(() -> chicken.makeNoise());
    }

    @Test
    void horseCanBeMountedAndDismounted() {
        Rider rider = new Farmer("Froilan");
        Horse horse = new Horse("Horse");
        assertDoesNotThrow(() -> horse.beMounted(rider));
        assertDoesNotThrow(() -> horse.beDismounted(rider));
    }

    @Test
    void tractorCanBeMountedAndDismounted() {
        Rider rider = new Farmer("Froilan");
        Tractor tractor = new Tractor();
        assertDoesNotThrow(() -> tractor.beMounted(rider));
        assertDoesNotThrow(() -> tractor.beDismounted(rider));
    }

    @Test
    void cropDusterCanBeMountedAndDismounted() {
        Rider rider = new Pilot("Froilanda");
        CropDuster cropDuster = new CropDuster();
        assertDoesNotThrow(() -> cropDuster.beMounted(rider));
        assertDoesNotThrow(() -> cropDuster.beDismounted(rider));
    }
}