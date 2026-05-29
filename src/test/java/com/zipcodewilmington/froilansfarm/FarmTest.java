package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FarmTest {

    private Farm farm;

    @BeforeEach
    void setUp() {
        farm = new Farm();
    }

    @Test
    void farmFirstRowStartsWithCorn() {
        assertTrue(farm.getField().getCropRows().get(0).getCrops().get(0) instanceof CornStalk);
    }

    @Test
    void farmSecondRowStartsWithTomato() {
        assertTrue(farm.getField().getCropRows().get(1).getCrops().get(0) instanceof TomatoPlant);
    }

    @Test
    void farmThirdRowStartsWithLettuce() {
        assertTrue(farm.getField().getCropRows().get(2).getCrops().get(0) instanceof LettucePlant);
    }

    @Test
    void farmHasOneField() {
        assertNotNull(farm.getField());
    }

    @Test
    void farmHasThreeStables() {
        assertEquals(3, farm.getStables().size());
    }

    @Test
    void farmHasTenHorses() {
        int horseCount = 0;
        for (Stable stable : farm.getStables()) {
            horseCount += stable.getHorses().size();
        }
        assertEquals(10, horseCount);
    }

    @Test
    void farmHasFourChickenCoops() {
        assertEquals(4, farm.getChickenCoops().size());
    }

    @Test
    void farmHasFifteenChickens() {
        int chickenCount = 0;
        for (ChickenCoop coop : farm.getChickenCoops()) {
            chickenCount += coop.getChickens().size();
        }
        assertEquals(15, chickenCount);
    }

    @Test
    void farmHasOneFarmHouse() {
        assertNotNull(farm.getFarmHouse());
    }

    @Test
    void farmFieldHasFiveCropRows() {
        assertEquals(5, farm.getField().getCropRows().size());
    }

    @Test
    void farmHouseContainsFroilanAndFroilanda() {
        assertEquals(2, farm.getFarmHouse().getPeople().size());
    }

    @Test
    void farmHasTwoFarmVehicles() {
        assertEquals(2, farm.getFarmVehicles().size());
    }

    @Test
    void farmHasOneAircraft() {
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
        boolean hasCropDuster = false;
        for (FarmVehicle vehicle : farm.getFarmVehicles()) {
            if (vehicle instanceof CropDuster) {
                hasCropDuster = true;
            }
        }
        assertTrue(hasCropDuster);
    }

    @Test
    void farmContainsTractor() {
        boolean hasTractor = false;
        for (FarmVehicle vehicle : farm.getFarmVehicles()) {
            if (vehicle instanceof Tractor) {
                hasTractor = true;
            }
        }
        assertTrue(hasTractor);
    }
}