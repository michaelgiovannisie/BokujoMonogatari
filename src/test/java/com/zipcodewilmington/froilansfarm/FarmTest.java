package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class FarmTest {

    @Test
    void farmFirstRowStartsWithCorn() {
        Farm farm = new Farm();
        assertTrue(farm.getField().getCropRows().get(0).getCrops().get(0) instanceof CornStalk);
    }

    @Test
    void farmSecondRowStartsWithTomato() {
        Farm farm = new Farm();
        assertTrue(farm.getField().getCropRows().get(1).getCrops().get(0) instanceof TomatoPlant);
    }

    @Test
    void farmThirdRowStartsWithLettuce() {
        Farm farm = new Farm();
        assertTrue(farm.getField().getCropRows().get(2).getCrops().get(0) instanceof LettucePlant);
    }

    @Test
    void farmHasOneField() {
        Farm farm = new Farm();

        assertNotNull(farm.getField());
    }

    @Test
    void farmHasThreeStables() {
        Farm farm = new Farm();

        assertEquals(3, farm.getStables().size());
    }

    @Test
    void farmHasTenHorses() {
        Farm farm = new Farm();
        int horseCount = 0;
        for (Stable stable : farm.getStables()) {
            horseCount += stable.getHorses().size();
        }
        assertEquals(10, horseCount);
    }

    @Test
    void farmHasFourChickenCoops() {
        Farm farm = new Farm();
        assertEquals(4, farm.getChickenCoops().size());
    }

    @Test
    void farmHasFifteenChickens() {
        Farm farm = new Farm();
        int chickenCount = 0;
        for (ChickenCoop coop : farm.getChickenCoops()) {
            chickenCount += coop.getChickens().size();
        }
        assertEquals(15, chickenCount);
    }

    @Test
    void farmHasOneFarmHouse() {
        Farm farm = new Farm();
        assertNotNull(farm.getFarmHouse());
    }

    @Test
    void farmFieldHasFiveCropRows() {
        Farm farm = new Farm();
        assertEquals(5, farm.getField().getCropRows().size());
    }

    @Test
    void farmHouseContainsFroilanAndFroilanda() {
        Farm farm = new Farm();
        assertEquals(2, farm.getFarmHouse().getPeople().size());
    }

    @Test
    void farmHasTwoFarmVehicles() {
        Farm farm = new Farm();
        assertEquals(2, farm.getFarmVehicles().size());
    }

    @Test
    void farmHasOneAircraft() {
        Farm farm = new Farm();
        int aircraftCount = 0;
        for (FarmVehicle vehicle : farm.getFarmVehicles()) {
            if (vehicle instanceof Aircraft) {
                aircraftCount++;
            }
        }
        assertEquals(1, aircraftCount);
    }

    @Test
    void farmContainsCropDuster() {
        Farm farm = new Farm();
        boolean hasCropDuster = false;
        for (FarmVehicle vehicle : farm.getFarmVehicles()) {
            if (vehicle instanceof CropDuster) {
                hasCropDuster = true;
            }
        }
        assertEquals(true, hasCropDuster);
    }

    @Test
    void farmContainsTractor() {
        Farm farm = new Farm();
        boolean hasTractor = false;
        for (FarmVehicle vehicle : farm.getFarmVehicles()) {
            if (vehicle instanceof Tractor) {
                hasTractor = true;
            }
        }
        assertEquals(true, hasTractor);
    }

}