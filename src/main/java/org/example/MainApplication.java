package org.example;

import java.util.Scanner;
import org.example.controllers.ArrayOperations;
import org.example.controllers.SurfDataIO;
import org.example.models.SurfForecast;
import org.example.views.ConsoleMenu;

/*
* Peer Review - Sean Standen
* I pulled all of your classes and your interface out of this file to clean up
* your project.  It will be much easier moving forward to find things on the fly.
* I also organized your classes into directories depending on the type.
* Directories:
* /controllers - Application logic that performs actions.
* /models - Classes that represent data types
* /views - Classes that render views.
* */

// Main Application class (Module 4)
public class MainApplication {
    /**
     * The main method for the application.
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {

        SurfForecast forecast = new SurfForecast();
        ConsoleMenu menu = new ConsoleMenu();
        Scanner scanner = new Scanner(System.in);
        SurfDataIO io = new SurfDataIO();

        // New code for Array Operations
        ArrayOperations arrayOps = new ArrayOperations();
        int[] oneDArray = {1, 2, 3, 4, 5};
        int[][] twoDArray = {{1, 2}, {3, 4}, {5, 6}};


        while (true) {
            // menu.showMenu();  // existing menu
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