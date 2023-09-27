package org.example;

import java.util.ArrayList;

/**
 * SurfForecast class for managing surf spots and their corresponding forecasts.
 */
public class SurfForecast {
    private ArrayList<String> surfSpots;
    private ArrayList<ArrayList<String>> forecasts;

    /**
     * Constructor initializes the surfSpots and forecasts lists.
     */
    public SurfForecast() {
        surfSpots = new ArrayList<>();
        forecasts = new ArrayList<>();
    }

    /**
     * Retrieves the surf spot at the given index.
     *
     * @param index The index of the surf spot.
     * @return The surf spot at the given index or an error message.
     */
    public String getSurfSpotAtIndex(int index) {
        if (surfSpots == null || surfSpots.isEmpty() || index < 0 || index >= surfSpots.size()) {
            return "Invalid index or empty list";
        }
        return surfSpots.get(index);
    }

    /**
     * Sets the surf spot at the given index.
     *
     * @param index The index to set the surf spot at.
     * @param surfSpot The name of the surf spot.
     */
    public void setSurfSpotAtIndex(int index, String surfSpot) {
        surfSpots.set(index, surfSpot);
    }

    /**
     * Finds the index of a given surf spot.
     *
     * @param surfSpot The name of the surf spot to find.
     * @return The index of the surf spot or -1 if not found.
     */
    public int findIndexOfSurfSpot(String surfSpot) {
        return surfSpots.indexOf(surfSpot);
    }

    /**
     * Prints all surf spots.
     */
    public void printAllSurfSpots() {
        System.out.println(surfSpots);
    }

    /**
     * Deletes the surf spot at the given index.
     *
     * @param index The index of the surf spot to delete.
     */
    public void deleteSurfSpotAtIndex(int index) {
        surfSpots.remove(index);
    }

    // ... (other methods remain the same, you can add JavaDoc comments in a similar fashion)
}
