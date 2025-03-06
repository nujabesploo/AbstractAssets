package com.pluralsight;

// Vehicle class extends Asset, meaning it inherits properties and methods from Asset
public class Vehicle extends Asset {

    // Properties specific to a Vehicle
    private String makeModel; // The make and model of the vehicle (e.g., "Honda Accord")
    private int year; // The manufacturing year of the vehicle
    private int odometer; // The number of miles the vehicle has been driven

    // Constructor to initialize a Vehicle object
    public Vehicle(String dateAcquired, String description, double originalCost, String makeModel, int year,
            int odometer) {
        super(dateAcquired, description, originalCost); // Calls the constructor of Asset
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    // Getter and setter for makeModel
    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public String getMakeModel() {
        return makeModel;
    }

    // Getter and setter for year
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    // Getter and setter for odometer
    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    // Overriding the abstract method getValue() from Asset class
    @Override
    public double getValue() {

        int age = 2025 - year; // Calculate the vehicle's age based on the current year (2025)
        double carValue = getOriginalCost(); // Start with the original cost of the car

        // Apply depreciation based on vehicle age
        if (age <= 3) { // Newer cars depreciate by 30% per year
            carValue = carValue * (1 - (0.3 * age));
        } else if (age >= 4 && age <= 6) { // Mid-age cars depreciate by 60% per year
            carValue = carValue * (1 - (0.6 * age));
        } else if (age >= 7 && age <= 10) { // Older cars depreciate by 80% per year
            carValue = carValue * (1 - (0.8 * age));
        } else { // Very old cars are given a base minimum value
            carValue = 1000.00;
        }

        // Additional depreciation if the car has more than 100,000 miles
        // (Except for reliable brands like Honda or Toyota)
        if (odometer > 100000 && !(makeModel.contains("Honda") || makeModel.contains("Toyota"))) {
            carValue = carValue * 0.75; // Reduce value by 25%
        }

        return carValue;
    }
}
