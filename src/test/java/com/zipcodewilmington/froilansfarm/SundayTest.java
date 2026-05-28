package com.zipcodewilmington.froilansfarm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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
}