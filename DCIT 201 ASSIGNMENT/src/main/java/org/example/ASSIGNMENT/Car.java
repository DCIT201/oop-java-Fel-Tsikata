package org.example.ASSIGNMENT;

public class Car extends Vehicle implements Rentable {


    public Car(String vehicleId,String model,double baseRentalRate,boolean isAvailable) {
        super(vehicleId,model,100.0,isAvailable);
    }


    @Override
    public double calculateRentalCost(int days) {
        return 100 * days;
    }

    @Override
    public boolean isAvailableForRental() {
        return isAvailable();
    }

    @Override
    public void rent(Customer customer, int days) {
        System.out.println(customer.getCustomerName() + " rented a car for " + days + " days.");
    }

    @Override
    public void returnVehicle() {
        System.out.println("Car has been returned.");
    }

    @Override
    public String toString() {
        return "Model: " + getModel() + ", Vehicle ID: " + getVehicleId();
    }



}
