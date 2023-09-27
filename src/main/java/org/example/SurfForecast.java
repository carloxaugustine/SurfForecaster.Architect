package org.example;

import java.util.ArrayList;

public class SurfForecast {
    private ArrayList<String> surfSpots;
    private ArrayList<ArrayList<String>> forecasts;

    public SurfForecast() {
        surfSpots = new ArrayList<>();
        forecasts = new ArrayList<>();
    }

    public String getSurfSpotAtIndex(int index) {
        return surfSpots.get(index);
    }

    public void setSurfSpotAtIndex(int index, String surfSpot) {
        surfSpots.set(index, surfSpot);
    }

    public int findIndexOfSurfSpot(String surfSpot) {
        return surfSpots.indexOf(surfSpot);
    }

    public void printAllSurfSpots() {
        System.out.println(surfSpots);
    }

    public void deleteSurfSpotAtIndex(int index) {
        surfSpots.remove(index);
    }

    public void expandSurfSpotArray() {
        surfSpots.add(null);
    }

    public void shrinkSurfSpotArray() {
        surfSpots.remove(surfSpots.size() - 1);
    }

    public String getForecastAtIndex(int index) {
        return forecasts.get(index).toString();
    }

    public void setForecastAtIndex(int index, String forecast) {
        forecasts.get(index).add(forecast);
    }

    public int findIndexOfForecast(String forecast) {
        for (int i = 0; i < forecasts.size(); i++) {
            if (forecasts.get(i).contains(forecast)) {
                return i;
            }
        }
        return -1;
    }

    public void printAllForecasts() {
        System.out.println(forecasts);
    }

    public void deleteForecastAtIndex(int index) {
        forecasts.remove(index);
    }

    public void expandForecastArray() {
        forecasts.add(new ArrayList<>());
    }

    public void shrinkForecastArray() {
        forecasts.remove(forecasts.size() - 1);
    }
}
