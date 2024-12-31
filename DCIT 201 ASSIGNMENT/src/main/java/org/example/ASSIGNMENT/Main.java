package org.example.ASSIGNMENT;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your Customer ID:");
        int customerID = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please input your name:");
        String customerName = scanner.nextLine();

        System.out.println("Please input your age:");
        int customerAge = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Please input your contact:");
        String customerContact = scanner.nextLine();

        System.out.println("Please input your Address:");
        String customerAddress = scanner.nextLine();

        System.out.println("Please input your email address:");
        String customerEmail = scanner.nextLine();

        System.out.println("Enter the number of days Vehicle is needed:");
        int days = scanner.nextInt();
        scanner.nextLine();

        Customer customer = new Customer(customerID, customerName, customerAge, customerContact, customerAddress, customerEmail, days, "");




        RentalAgency agency = new RentalAgency("Eloquent Rentals" , "Tema Community 22");
        agency.agencyDetails();




        //agency.registerCustomer();

        //Adding vehicles
        agency.addVehicle("Toyota Camry");
        agency.addVehicle("Honda Civic");
        agency.addVehicle("Ford F-150");
        agency.addVehicle("RAM 1500");
        agency.addVehicle("Honda Rebel 500");

        agency.displayVehicles();
        agency.availableVehicles();

        //agency.vehiclesInRental();//

        System.out.println("Enter the vehicle you want from the list provided:");
        String selectVehicle = scanner.nextLine();
        customer.setSelectVehicle(selectVehicle);



        agency.rentVehicle(selectVehicle,customer);

        System.out.println("Enter the vehicle ID you want to rent:");
        String vehicleId = scanner.nextLine();


        Vehicle rentedVehicle = agency.rentVehicle(vehicleId, customer);

        if (rentedVehicle != null) {
            Car rentedCar = (Car) rentedVehicle;
            double rentalCost = rentedCar.calculateRentalCost(days);
            System.out.println("Rental cost for " + days + " days: " + rentalCost);
        } else {
            System.out.println("Could not rent the vehicle.");
        }



        customer.customerdetails();

        agency.returnVehicle(selectVehicle,customer);

        customer.customerdetails();


        agency.fleetReport();

        agency.rentalReport();












    }
}
