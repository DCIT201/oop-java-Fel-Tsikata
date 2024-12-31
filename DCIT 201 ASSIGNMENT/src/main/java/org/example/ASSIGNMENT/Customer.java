package org.example.ASSIGNMENT;

import java.util.ArrayList;

public class Customer {
    private int customerID;
    private String customerName;
    private int customerAge;
    private String customerContact;
    private String customerAddress;
    private String customerEmail;
    private int days;
    private ArrayList <Vehicle> rentalHistory;
    private ArrayList <Vehicle> currentRentals;
    private String selectVehicle;


    public Customer(int customerID, String customerName, int customerAge, String customerContact, String customerAddress, String customerEmail, int days, String selectVehicle) {
        this.customerID = customerID;
        this.customerName = customerName;
        this.customerAge = customerAge;
        this.customerContact = customerContact;
        this.customerAddress = customerAddress;
        this.customerEmail = customerEmail;
        this.days= days;
        this.rentalHistory = new ArrayList<> ();
        this.currentRentals = new ArrayList<>();
        this.selectVehicle = selectVehicle;
    }

    public boolean eligibleForRental() {
        if (customerAge >= 18){
            return true;
        }else{
            return false;
        }
    }

    public boolean addRental(Vehicle rental) {
        if (eligibleForRental()) {
            if (currentRentals.contains(rental)) {
                System.out.println(rental.getModel() + " is already rented by " + customerName + ".");
                return false;
            }
            currentRentals.add(rental);
            System.out.println(rental.getModel() + " has been rented by " + customerName + ".");
            return true;
        } else {
            System.out.println(customerName + " is not eligible to rent.");
            return false;
        }
    }

    public boolean returnRental(Vehicle rental) {
        if (currentRentals.remove(rental)) {
            rentalHistory.add(rental);
            System.out.println(rental.getModel() + " has been returned and added to rental history.");
            return true;
        } else {
            System.out.println(rental.getModel() + " is not found in current rentals.");
            return false;
        }
    }

    public int getCustomerID() {
        return customerID;
    }
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
   public String getCustomerName() {
       return customerName;
   }
   public void setCustomerName(String customerName) {
       this.customerName = customerName;
   }
   public int getCustomerAge() {
       return customerAge;
   }
   public void setCustomerAge(int customerAge) {
       this.customerAge = customerAge;
   }
   public String getCustomerContact() {
       return customerContact;
   }
   public void setCustomerContact(String customerContact) {
       this.customerContact = customerContact;
   }
   public String getCustomerAddress() {
       return customerAddress;
   }
   public void setCustomerAddress(String customerAddress) {
       this.customerAddress = customerAddress;
   }
   public String getCustomerEmail() {
       return customerEmail;
   }
   public void setCustomerEmail(String customerEmail) {
       this.customerEmail = customerEmail;
   }
   public int getDays() {
        return days;
   }
   public void setDays(int days) {
        this.days = days;
   }
   public ArrayList <Vehicle> getRentalHistory() {
       return rentalHistory;
   }
   public void setRentalHistory(ArrayList <Vehicle> rentalHistory) {
       this.rentalHistory = rentalHistory;
   }
   public ArrayList <Vehicle> getCurrentRentals() {
        return currentRentals;
   }
   public void setCurrentRentals(ArrayList <Vehicle> currentRentals) {
        this.currentRentals = currentRentals;
   }
   public String getSelectVehicle() {
        return selectVehicle;
   }
   public void setSelectVehicle(String selectVehicle) {
        this.selectVehicle = selectVehicle;
   }

    public void customerdetails() {
        System.out.println("Customer ID: " + customerID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer Age: " + customerAge);
        System.out.println("Customer Contact: " + customerContact);
        System.out.println("Customer Address: " + customerAddress);
        System.out.println("Customer Email: " + customerEmail);
        System.out.println("Current Rentals: " + currentRentals);
        System.out.println("Rental History: " + rentalHistory);
        System.out.println("Current Rentals: " + (currentRentals.isEmpty() ? "No current rentals" : currentRentals));
        System.out.println("Rental History: " + (rentalHistory.isEmpty() ? "No rental history" : rentalHistory));
    }



}
