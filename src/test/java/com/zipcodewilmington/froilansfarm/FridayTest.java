package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FridayTest {

    private Farmer froilan;
    private Pilot froilanda;

    @BeforeEach
    void setUp() {
        froilan = new Farmer("Froilan");
        froilanda = new Pilot("Froilanda");
    }

    @Test
    void peopleCanMakeNoise() {
        assertDoesNotThrow(() -> froilan.makeNoise());
        assertDoesNotThrow(() -> froilanda.makeNoise());
    }
}