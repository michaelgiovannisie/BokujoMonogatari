package com.zipcodewilmington.froilansfarm;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SaturdayTest {

    private Tractor tractor;
    private CropDuster cropDuster;
    private Horse horse;

    @BeforeEach
    void setUp() {
        tractor = new Tractor();
        cropDuster = new CropDuster();
        horse = new Horse("Horse");
    }

    @Test
    void farmVehiclesCanMakeNoise() {
        assertDoesNotThrow(() -> tractor.makeNoise());
        assertDoesNotThrow(() -> cropDuster.makeNoise());
    }

    @Test
    void horseCanMakeNoise() {
        assertDoesNotThrow(() -> horse.makeNoise());
    }

    @Test
    void riderCanMountAndDismountFarmVehicles() {
        Farmer froilan = new Farmer("Froilan");

        assertDoesNotThrow(() -> {
            froilan.mount(tractor);
            froilan.dismount(tractor);
            froilan.mount(cropDuster);
            froilan.dismount(cropDuster);
        });
    }
}