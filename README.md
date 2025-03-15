# 💰 Asset Management System 2.0 🏡🚗💵

Welcome to **Asset Management System 2.0**, an enhanced Java application that allows you to manage various asset types—including houses, vehicles, and cash! 🏠🚘💰 This project demonstrates **object-oriented programming (OOP)** concepts, including **inheritance, polymorphism, encapsulation, and downcasting**.

---

## 📌 Features
✔️ Manage multiple types of assets (Houses, Vehicles, Cash)  
✔️ Store and display asset details dynamically  
✔️ Demonstrates Java OOP principles (Inheritance, Polymorphism, Encapsulation)  
✔️ Uses **downcasting** and `instanceof` for type-specific behavior  

---

## 🛠 Technologies Used
- **Java** ☕  
- **OOP (Inheritance, Polymorphism, Encapsulation, Downcasting)**  
- **ArrayLists for dynamic storage**  
- **Formatted output for better readability**  

---

## 📸 Screenshots

<img src="https://github.com/user-attachments/assets/c7fd615a-8a28-40a1-8f78-73cdc5378f06" alt="Screenshot 2025-03-15 at 12 32 33 PM" width="400" height="250">

---

## 🚀 Getting Started

### 📥 Installation
1. Clone this repository:
   ```sh
   git clone https://github.com/YourGitHubUsername/YourRepositoryName.git
   ```
2. Open the project in your favorite IDE (IntelliJ, Eclipse, VS Code).  
3. Run the `Main.java` file to see it in action! 🎬  

---

## 🏗 Project Structure

```
📂 com.pluralsight
 ┣ 📜 Main.java         // Entry point of the application
 ┣ 📜 Asset.java        // Base class for all assets
 ┣ 📜 House.java        // Subclass representing a house asset
 ┣ 📜 Vehicle.java      // Subclass representing a vehicle asset
 ┗ 📜 Cash.java         // Subclass representing a cash asset
```

---

## 📖 How It Works

1. **Creates an asset collection** using an `ArrayList<Asset>`.  
2. **Adds different assets** (houses, vehicles, cash) to the collection.  
3. **Displays asset information** using polymorphism and `instanceof` checks.  

```java
// Create an asset collection
ArrayList<Asset> myAssets = new ArrayList<>();

// Add a house
myAssets.add(new House("01/15/2020", "My house", 250000.00, "123 Main St", 1, 2000, 5000));

// Add a vehicle
myAssets.add(new Vehicle("03/10/2023", "Family car", 35000.00, "Honda Accord", 2022, 15000));

// Add cash
myAssets.add(new Cash("01/01/2024", "Emergency fund", 5000.00));
```

---

## 🎯 Future Enhancements
✅ Add GUI for better user experience 🎨  
✅ Implement database storage (MySQL, PostgreSQL) 🗄  
✅ Add user authentication for asset management 🔐  

---

## ✨ Crediting & Publishing

If you use or modify this project:  
✔️ **Give credit** by mentioning the original project in your repository.  
✔️ **Feel free to fork** and customize for your own needs.  
✔️ **Publish improvements** and contribute back to the community!  

If you plan to **publish** your own version, please:  
📌 Include an acknowledgment to this original repository.  
📌 Clearly document any modifications or enhancements you've made.  

---

🌟 If you like this project, consider giving it a ⭐ **star** on GitHub!  
