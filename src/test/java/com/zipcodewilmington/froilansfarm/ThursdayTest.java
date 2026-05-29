package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ThursdayTest {

    @Test
    void cornStalkCanYieldEarCorn() {
        CornStalk cornStalk = new CornStalk();

        Edible earCorn = cornStalk.yield();

        assertTrue(earCorn instanceof EarCorn);
    }
}