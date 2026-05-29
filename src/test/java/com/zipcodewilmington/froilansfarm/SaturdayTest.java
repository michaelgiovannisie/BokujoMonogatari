package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.Test;

public class SaturdayTest {
    @Test
    void farmVehiclesCanMakeNoise() {
        Tractor tractor = new Tractor();
        CropDuster cropDuster = new CropDuster();

        assertDoesNotThrow(() -> tractor.makeNoise());
        assertDoesNotThrow(() -> cropDuster.makeNoise());
    }
}
