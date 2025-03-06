package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Create a list to store different types of assets (Houses, Vehicles, and Cash)
        ArrayList<Asset> myAssets = new ArrayList<Asset>();

        // Adding houses to the asset list
        myAssets.add(new House("01/15/2020", "My house", 250000.00,
                "123 Main St", 1, 2000, 5000));
        myAssets.add(new House("06/22/2019", "Vacation home", 175000.00,
                "456 Beach Ave", 2, 1500, 3000));

        // Adding vehicles to the asset list
        myAssets.add(new Vehicle("03/10/2023", "Family car", 35000.00,
                "Honda Accord", 2022, 15000));
        myAssets.add(new Vehicle("07/05/2017", "Pickup truck", 45000.00,
                "Ford F-150", 2016, 120000));

        // Adding a cash asset (emergency fund)
        Cash mattressMoney = new Cash("01/01/2024", "Emergency fund", 5000.00);
        myAssets.add(mattressMoney);

        // Print a title for the asset information
        System.out.println("Asset Information:");
        System.out.println("=================");

        // Loop through each asset and print its details
        for (Asset asset : myAssets) {
            System.out.println("Description: " + asset.getDescription()); // Print asset description
            System.out.println("Date Acquired: " + asset.getDateAcquired()); // Print acquisition date
            System.out.println("Original Cost: $" + String.format("%.2f", asset.getOriginalCost())); // Print formatted
                                                                                                     // cost
            System.out.println("Current Value: $" + String.format("%.2f", asset.getValue())); // Print formatted current
                                                                                              // value

            // **Downcasting and Using instanceOf**
            // Java doesn't automatically know what specific type an asset is (House,
            // Vehicle, or Cash)
            // We use `instanceof` to check the type before downcasting to access
            // type-specific methods

            if (asset instanceof House) { // If asset is a House
                House house = (House) asset; // Downcast asset to House
                System.out.println("Address: " + house.getAddress()); // Now we can access House-specific methods

            } else if (asset instanceof Vehicle) { // If asset is a Vehicle
                Vehicle vehicle = (Vehicle) asset; // Downcast asset to Vehicle
                System.out.println("Make/Model: " + vehicle.getMakeModel()); // Print vehicle details
                System.out.println("Year: " + vehicle.getYear());

            } else if (asset instanceof Cash) { // If asset is Cash
                System.out.println("Type: Cash"); // Simply indicate it's cash (no additional details needed)
            }

            System.out.println("-----------------"); // Separator for readability
        }
    }
}
