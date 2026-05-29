package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SundayTest {

    private Farmer froilan;
    private CropRow row1;
    private CropRow row2;
    private CropRow row3;

    @BeforeEach
    void setUp() {
        froilan = new Farmer("Froilan");

        row1 = new CropRow();
        row2 = new CropRow();
        row3 = new CropRow();
    }

    @Test
    void froilanPlantsCropsInFirstThreeRows() {
        froilan.plant(new CornStalk(), row1);
        froilan.plant(new TomatoPlant(), row2);
        froilan.plant(new LettucePlant(), row3);

        assertTrue(row1.getCrops().get(0) instanceof CornStalk);
        assertTrue(row2.getCrops().get(0) instanceof TomatoPlant);
        assertTrue(row3.getCrops().get(0) instanceof LettucePlant);
    }

    @Test
    void cropRowStartsEmpty() {
        assertTrue(row1.getCrops().isEmpty());
    }

    @Test
    void cropRowStoresMultipleCrops() {
        row1.addCrop(new CornStalk());
        row1.addCrop(new TomatoPlant());
        row1.addCrop(new LettucePlant());

        assertEquals(3, row1.getCrops().size());
    }
}