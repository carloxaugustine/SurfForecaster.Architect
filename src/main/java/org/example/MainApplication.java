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
        System.out.println("Array Operations Menu:");
        System.out.println("1. Get element at index (1D array)");
        System.out.println("2. Set element at index (1D array)");
        System.out.println("8. Get element at index (2D array)");
        System.out.println("9. Set element at index (2D array)");
        System.out.println("Enter your choice for array operations:");
    }

    public int getAtIndex(int[] arr, int index) {
        return arr[index];
    }

    public void setAtIndex(int[] arr, int index, int value) {
        arr[index] = value;
    }

    public int getAtIndex(int[][] arr, int row, int col) {
        return arr[row][col];
    }

    public void setAtIndex(int[][] arr, int row, int col, int value) {
        arr[row][col] = value;
    }
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
        int[] oneDArray = {1, 2, 3, 4, 5};
        int[][] twoDArray = {{1, 2}, {3, 4}, {5, 6}};


        while (true) {
            // menu.showMenu();  // Your existing menu
            arrayOps.showMenu();  // New menu for array operations

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter index:");
                    int index1 = scanner.nextInt();
                    System.out.println("Element: " + arrayOps.getAtIndex(oneDArray, index1));
                    break;
                case 2:
                    System.out.println("Enter index and value:");
                    int index2 = scanner.nextInt();
                    int value2 = scanner.nextInt();
                    arrayOps.setAtIndex(oneDArray, index2, value2);
                    break;
                case 8:
                    System.out.println("Enter row and column:");
                    int row8 = scanner.nextInt();
                    int col8 = scanner.nextInt();
                    System.out.println("Element: " + arrayOps.getAtIndex(twoDArray, row8, col8));
                    break;
                case 9:
                    System.out.println("Enter row, column, and value:");
                    int row9 = scanner.nextInt();
                    int col9 = scanner.nextInt();
                    int value9 = scanner.nextInt();
                    arrayOps.setAtIndex(twoDArray, row9, col9, value9);
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println("Do you want to continue? (y/n)");
            String continueChoice = scanner.next();
            if ("n".equalsIgnoreCase(continueChoice)) {
                break;
            }
        }

        scanner.close();
    }
}