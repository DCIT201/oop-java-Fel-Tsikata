package org.example.ASSIGNMENT;

public abstract class Vehicle {
    private String vehicleId;
    private String model;
    private double baseRentalRate;
    private boolean isAvailable;



    public Vehicle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.baseRentalRate = baseRentalRate;
        this.isAvailable = isAvailable;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public String getModel() {
        return model;
    }
    public double getBaseRentalRate() {
        return baseRentalRate;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setvehicleid(String vehicleid) {
        this.vehicleId = vehicleid;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setbaserentalrate(double baseRentalRate) {
        this.baseRentalRate = baseRentalRate;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }


    public abstract double calculateRentalCost(int days);
    public abstract boolean isAvailableForRental();


}
