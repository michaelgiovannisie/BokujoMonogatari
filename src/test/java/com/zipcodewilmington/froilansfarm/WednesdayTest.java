package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.*;

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
}