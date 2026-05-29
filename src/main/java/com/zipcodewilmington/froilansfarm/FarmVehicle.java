package com.zipcodewilmington.froilansfarm;

import java.util.ArrayList;
import java.util.List;

public abstract class FarmVehicle extends Vehicle {
    private List<FarmVehicle> farmVehicles;

    public FarmVehicle() {
        farmVehicles = new ArrayList<>();
        farmVehicles.add(new Tractor());
        farmVehicles.add(new CropDuster());
    }

    public abstract void operate(Farm farm);

    public List<FarmVehicle> getFarmVehicles() {
        return farmVehicles;
    }
}
