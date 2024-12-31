package org.example.ASSIGNMENT;
import java.util.ArrayList;

public class RentalAgency {
    private String agencyName;
    private String agencyAddress;
    private ArrayList<Vehicle> vehicleFleet; // Now storing Vehicle objects
    private ArrayList<Vehicle> rentedVehicles; // Now storing Vehicle objects
    private ArrayList<Vehicle> availableVehicles; // Now storing Vehicle objects

    public RentalAgency(String agencyName, String agencyAddress) {
        this.agencyName = agencyName;
        this.agencyAddress = agencyAddress;
        this.vehicleFleet = new ArrayList<>();
        this.rentedVehicles = new ArrayList<>();
        this.availableVehicles = new ArrayList<>();
    }

    public void agencyDetails(){
        System.out.println("Agency Name: " + agencyName);
        System.out.println("Agency Address: " + agencyAddress);
    }


    public Car addVehicle(String model) {
        String vehicleId = "V" + (vehicleFleet.size() + 1);
        boolean isAvailable = true;

        Car car = new Car(vehicleId, model,100.0,isAvailable);
        vehicleFleet.add(car);
        availableVehicles.add(car);
        System.out.println(model + " has been added to the fleet of vehicles and is available.");
        return car;
    }

    public Vehicle rentVehicle(String vehicleId, Customer customer) {
        for (Vehicle vehicle : availableVehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                if (customer.eligibleForRental()) {
                    availableVehicles.remove(vehicle);
                    rentedVehicles.add(vehicle);
                    vehicle.setAvailable(false);
                    customer.addRental(vehicle);
                    System.out.println(vehicle.getModel() + " has been rented by " + customer.getCustomerName());
                    return vehicle;
                } else {
                    System.out.println(customer.getCustomerName() + " is not eligible to rent.");
                    return null;
                }
            }
        }
        System.out.println("Vehicle is not available for rent.");
        return null;
    }

    public void returnVehicle(String vehicleId, Customer customer) {
        for (Vehicle vehicle : rentedVehicles) {
            if (vehicle.getVehicleId().equals(vehicleId)) {
                rentedVehicles.remove(vehicle);
                availableVehicles.add(vehicle);
                vehicle.setAvailable(true);  // Mark as available again
                customer.returnRental(vehicle);
                System.out.println(vehicle.getModel() + " has been returned by " + customer.getCustomerName() + " and is now available.");
                return;
            }
        }
        System.out.println("Vehicle is not found in the rented list or doesn't belong to the customer.");
    }

    public void displayVehicles() {
        System.out.println("Vehicle is not available for return or doesn't belong to the customer.");
        for (Vehicle vehicle : vehicleFleet) {
            System.out.println(vehicle);
        }
    }

    public void availableVehicles() {
        System.out.println("Available Vehicles:");
        for (Vehicle vehicle : availableVehicles) {
            System.out.println(vehicle.getModel());
        }
    }

    public void rentedVehicles() {
        System.out.println("Rented Vehicles:");
        for (Vehicle vehicle : rentedVehicles) {
            System.out.println(vehicle.getModel());
        }
    }

    public void fleetReport() {
        System.out.println("Fleet Report:");
        System.out.println("Total Vehicles: " + vehicleFleet.size());
        System.out.println("Available Vehicles: " + availableVehicles.size());
        System.out.println("Rented Vehicles: " + rentedVehicles.size());
    }

    public void rentalReport() {
        System.out.println("Rental Report:");
        for (Vehicle vehicle : rentedVehicles) {
            System.out.println("Rented: " + vehicle.getModel());
        }
    }
}
