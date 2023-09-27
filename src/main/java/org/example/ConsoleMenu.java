package org.example;

import java.util.Scanner;

public class ConsoleMenu {

    private final Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        System.out.println("1. Get surf spot at index (1D array)");
        System.out.println("2. Set surf spot at index (1D array)");
        System.out.println("3. Find index of surf spot (1D array)");
        System.out.println("4. Print all surf spots (1D array)");
        System.out.println("5. Delete surf spot at index (1D array)");
        System.out.println("6. Expand 1D array");
        System.out.println("7. Shrink 1D array");
        System.out.println("8. Get forecast at index (2D array)");
        System.out.println("9. Set forecast at index (2D array)");
        System.out.println("10. Find index of forecast (2D array)");
        System.out.println("11. Print all forecasts (2D array)");
        System.out.println("12. Delete forecast at index (2D array)");
        System.out.println("13. Expand 2D array");
        System.out.println("14. Shrink 2D array");
        System.out.println("15. Open JavaFX GUI");
        System.out.println("16. Save Data");
        System.out.println("17. Load Data");
        System.out.println("Enter your choice:");
    }


    private int promptForIndex(String message) {
        System.out.println(message);
        return scanner.nextInt();
    }

    private String promptForString(String message) {
        System.out.println(message);
        return scanner.next();
    }

    public void executeChoice(int choice, SurfForecast forecast, SurfDataIO io) {
        int index;
        String surfSpot;
        String forecastData;

        switch (choice) {
            case 1:
                index = promptForIndex("Enter the index to get the surf spot:");
                surfSpot = forecast.getSurfSpotAtIndex(index);
                System.out.println("Surf spot at index " + index + ": " + surfSpot);
                break;
            case 2:
                index = promptForIndex("Enter the index to set the surf spot:");
                surfSpot = promptForString("Enter the name of the surf spot:");
                forecast.setSurfSpotAtIndex(index, surfSpot);
                break;
            case 3:
                surfSpot = promptForString("Enter the name of the surf spot to find:");
                index = forecast.findIndexOfSurfSpot(surfSpot);
                System.out.println("Index of surf spot: " + index);
                break;
            case 4:
                forecast.printAllSurfSpots();
                break;
            case 5:
                index = promptForIndex("Enter the index to delete the surf spot:");
                forecast.deleteSurfSpotAtIndex(index);
                break;
            // ... (other cases remain the same)
            case 16:
                handleSaveData(forecast, io);
                break;
            case 17:
                handleLoadData(forecast, io);
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    private void handleSaveData(SurfForecast forecast, SurfDataIO io) {
        try {
            io.saveData(forecast);
            System.out.println("Data saved.");
        } catch (Exception e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    private void handleLoadData(SurfForecast forecast, SurfDataIO io) {
        try {
            forecast = io.loadData();
            System.out.println("Data loaded.");
        } catch (Exception e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}
