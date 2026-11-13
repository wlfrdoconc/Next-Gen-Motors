package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Dealership {

    // Dealership attributes
    private String name;
    private String address;
    private String phone;
    private ArrayList<Vehicle> inventory;

    // Constructors

    // Empty Constructor
    public Dealership() {
        this.inventory = new ArrayList<>();
    }

    // Parameterized Constructor
    public Dealership(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.inventory = new ArrayList<>();
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    // Methods

    // Add vehicle to inventory
    public void addVehicle(Vehicle vehicle) {
        inventory.add(vehicle);
    }

    // Get all vehicles
    public List<Vehicle> getAllVehicles() {
        return inventory;
    }

    // PLACEHOLDERS TO FILL

    // Find vehicles within a price range
    public List<Vehicle> getVehiclesByPrice(double min, double max) {
        return null;
    }

    // Find vehicles by make and model
    public List<Vehicle> getVehiclesByMakeModel(String make, String model) {
        return null;
    }

    // Find vehicles within a year range
    public List<Vehicle> getVehiclesByYear(int min, int max) {
        return null;
    }

    // Find vehicles by color
    public List<Vehicle> getVehiclesByColor(String color) {
        return null;
    }

    // Find vehicles within a mileage range
    public List<Vehicle> getVehiclesByMileage(int min, int max) {
        return null;
    }

    // Find vehicles by vehicle type
    public List<Vehicle> getVehiclesByType(String vehicleType) {
        return null;
    }

    // Remove vehicle from inventory
    public void removeVehicle(Vehicle vehicle) {

    }

}
