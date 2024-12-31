package org.example.ASSIGNMENT;

public class RentalTransaction {
    private String transactionId;
    private String vehicleId;
    private String customerId;
    private boolean paid;

    public RentalTransaction(String transactionId, String vehicleId, String customerId) {
        this.transactionId = transactionId;
        this.vehicleId = vehicleId;
        this.customerId = customerId;
        this.paid = false;
    }

    public String getTransactionId() {
        return transactionId;
    }
    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }
    public String getVehicleId() {
        return vehicleId;
    }
    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }
    public String getCustomerId() {
        return customerId;
    }
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }
    public boolean Paid() {
        return paid;
    }
    public void setPaid(boolean paid) {
        this.paid = paid;
    }



}