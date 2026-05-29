package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ThursdayTest {

    @Test
    void cornStalkCanYieldEarCorn() {
        CornStalk cornStalk = new CornStalk();

        assertTrue(cornStalk.yield() instanceof EarCorn);
    }

    @Test
    void tomatoPlantCanYieldTomato() {
        TomatoPlant tomatoPlant = new TomatoPlant();

        assertTrue(tomatoPlant.yield() instanceof Tomato);
    }

    @Test
    void lettucePlantCanYieldLettuce() {
        LettucePlant lettucePlant = new LettucePlant();

        assertTrue(lettucePlant.yield() instanceof Lettuce);
    }
}