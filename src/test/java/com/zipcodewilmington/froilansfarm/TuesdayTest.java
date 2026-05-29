package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TuesdayTest {

    private Farm farm;
    private Tractor tractor;

    @BeforeEach
    void setUp() {
        farm = new Farm();
        tractor = new Tractor();

        farm.getField().getCropRows().get(0).addCrop(new CornStalk());
        farm.getField().getCropRows().get(1).addCrop(new TomatoPlant());
        farm.getField().getCropRows().get(2).addCrop(new LettucePlant());
    }

    @Test
    void tractorCanHarvestEachCrop() {

        for (CropRow row : farm.getField().getCropRows()) {

            for (Crop<?> crop : row.getCrops()) {
                tractor.harvest(crop);

                assertTrue(crop.hasBeenHarvested());
            }
        }
    }

    @Test
    void tractorCanOperateOnFarm() {
        assertDoesNotThrow(() -> tractor.operate(farm));
    }
    @Test
    void tractorOperateHarvestsEntireFarm() {
        tractor.operate(farm);
        for (CropRow row : farm.getField().getCropRows()) {
            for (Crop<?> crop : row.getCrops()) {
                assertTrue(crop.hasBeenHarvested());
            }
        }
    }
}