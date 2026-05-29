package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MondayTest {

    private Farm farm;
    private CropDuster cropDuster;

    @BeforeEach
    void setUp() {
        farm = new Farm();
        cropDuster = new CropDuster();
    }

    @Test
    void cropDusterCanFertilizeEachCropRow() {

        for (CropRow row : farm.getField().getCropRows()) {
            cropDuster.fertilize(row);
            assertTrue(row.hasBeenFertilized());
        }
    }

    @Test
    void cropDusterCanFly() {
        assertDoesNotThrow(() -> cropDuster.fly());
    }

    @Test
    void cropDusterOperateFertilizesEntireFarm() {
        cropDuster.operate(farm);
        for (CropRow row : farm.getField().getCropRows()) {
            assertTrue(row.hasBeenFertilized());
        }
    }
}