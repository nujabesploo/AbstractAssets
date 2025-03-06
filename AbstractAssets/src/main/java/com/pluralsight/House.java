package com.pluralsight;

// House class extends Asset, meaning it inherits common properties from Asset
public class House extends Asset {

    // Properties specific to a House
    private String address; // The physical location of the house
    private int condition; // Condition rating of the house (1 = best, 4 = worst)
    private int squareFoot; // The size of the house in square feet
    private int lotSize; // The size of the lot the house sits on

    // Constructor to initialize House object
    public House(String dateAcquired, String description, double originalCost, String address, int condition,
            int squareFoot, int lotSize) {
        super(dateAcquired, description, originalCost); // Calls the constructor of the parent class (Asset)
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    // Getter and setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // Getter and setter for condition
    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    // Getter and setter for squareFoot
    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    // Getter and setter for lotSize
    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    // Overriding the abstract method getValue() from Asset class
    @Override
    public double getValue() {
        double valuePerSquareFoot = 0; // Default value, will be set based on condition

        // Assign value per square foot based on the house condition
        if (condition == 1) {
            valuePerSquareFoot = 180.00; // Excellent condition
        } else if (condition == 2) {
            valuePerSquareFoot = 130.00; // Good condition
        } else if (condition == 3) {
            valuePerSquareFoot = 90.00; // Fair condition
        } else if (condition == 4) {
            valuePerSquareFoot = 80.00; // Poor condition
        }

        // Calculate base value (house square footage * value per square foot)
        double baseValue = valuePerSquareFoot * squareFoot;

        // Lot value is calculated as 25% of (squareFoot * lotSize)
        double lotValue = (0.25 * squareFoot * lotSize);

        // The total value of the house is the base value plus the lot value
        return baseValue + lotValue;
    }
}
