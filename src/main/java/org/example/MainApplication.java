package org.example;

import java.util.ArrayList;
import java.util.Scanner;

// Interface for Data Import
interface DataImport {
    ArrayList<String> importData();
}

// Implementation of DataImport
class SurfLineDataImport implements DataImport {
    public ArrayList<String> importData() {
        // Fake data for demonstration
        ArrayList<String> data = new ArrayList<>();
        data.add("Fake Data 1");
        data.add("Fake Data 2");
        return data;
    }
    }

// Base User class
class User {
    public void sharedMethod() {
        System.out.println("This is a shared method.");
    }
}

// Admin class extending User
class Admin extends User {
    public void adminMethod() {
        System.out.println("This is an admin-specific method.");
    }
}

// Customer class extending User
class Customer extends User {
    public void customerMethod() {
        System.out.println("This is a customer-specific method.");
    }
}

// Class for Array Operations (Module 1 & 2)
class ArrayOperations {
    public void showMenu() {
        System.out.println("1. Get element at index (1D array)");
        System.out.println("2. Set element at index (1D array)");
        // ... Add other options for 1D array
        System.out.println("8. Get element at index (2D array)");
        System.out.println("9. Set element at index (2D array)");
        // ... Add other options for 2D array
        System.out.println("Enter your choice:");
    }

    // Implement methods for getAtIndex, setAtIndex, etc.
}

// Main Application class (Module 4)
public class MainApplication {
    public static void main(String[] args) {
        // Your existing code
        SurfForecast forecast = new SurfForecast();
        ConsoleMenu menu = new ConsoleMenu();
        Scanner scanner = new Scanner(System.in);
        SurfDataIO io = new SurfDataIO();

        // New code for Array Operations
        ArrayOperations arrayOps = new ArrayOperations();

        while (true) {
            menu.showMenu();  // Your existing menu
            arrayOps.showMenu();  // New menu for array operations

            int choice = scanner.nextInt();

            // Your existing switch-case and new cases for array operations
            // ...

            System.out.println("Do you want to continue? (y/n)");
            String continueChoice = scanner.next();
            if ("n".equalsIgnoreCase(continueChoice)) {
                break;
            }
        }

        scanner.close();
    }
}
