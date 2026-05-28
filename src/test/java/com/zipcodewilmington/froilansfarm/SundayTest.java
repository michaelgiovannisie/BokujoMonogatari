package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class SundayTest {

    @Test
    void froilanPlantsCropsInFirstThreeRows() {
        Farmer froilan = new Farmer("Froilan");

        CropRow row1 = new CropRow();
        CropRow row2 = new CropRow();
        CropRow row3 = new CropRow();

        froilan.plant(new CornStalk(), row1);
        froilan.plant(new TomatoPlant(), row2);
        froilan.plant(new LettucePlant(), row3);

        assertTrue(row1.getCrops().get(0) instanceof CornStalk);
        assertTrue(row2.getCrops().get(0) instanceof TomatoPlant);
        assertTrue(row3.getCrops().get(0) instanceof LettucePlant);
    }

    @Test
    void cropRowStartsEmpty() {
        CropRow row = new CropRow();
        assertTrue(row.getCrops().isEmpty());
    }

    @Test
    void cropRowStoresMultipleCrops() {
        CropRow row = new CropRow();

        row.addCrop(new CornStalk());
        row.addCrop(new TomatoPlant());
        row.addCrop(new LettucePlant());

        assertEquals(3, row.getCrops().size());
    }
}