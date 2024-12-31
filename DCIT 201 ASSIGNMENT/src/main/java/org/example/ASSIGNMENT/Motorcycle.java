package org.example.ASSIGNMENT;

public class Motorcycle extends Vehicle implements Rentable{

    public Motorcycle(String vehicleId, String model, double baseRentalRate, boolean isAvailable) {
        super(vehicleId, model, baseRentalRate, isAvailable);
    }

    public double calculateRentalCost(int days) {
        return 150 * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return false;
    }

    public void rent(Customer customer, int days) {
        System.out.println(customer.getCustomerName() + " rented a motorcycle for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Motorcycle has been returned.");
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + ", Vehicle ID: " + getVehicleId();
    }



}
