package org.example.ASSIGNMENT;

public class Truck extends Vehicle implements Rentable{

    public Truck(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    @Override
    public double calculateRentalCost(int days) {
        return 200 * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return false;
    }

    public void rent(Customer customer, int days) {
        System.out.println(customer.getCustomerName() + " rented a truck for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Truck has been returned.");
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + ", Vehicle ID: " + getVehicleId();
    }



}
