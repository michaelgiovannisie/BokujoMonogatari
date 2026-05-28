package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FarmTest {

    @Test
    void farmHasOneField() {
        Farm farm = new Farm();

        assertNotNull(farm.getField());
    }
}