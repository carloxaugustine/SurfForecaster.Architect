package org.example.controllers;

import org.example.models.SurfForecast;

import java.io.*;

/**
 * SurfDataIO class for handling the saving and loading of surf forecast data.
 */
public class SurfDataIO {

    /**
     * Saves the SurfForecast object to a file.
     *
     * @param forecast The SurfForecast object to be saved.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public void saveData(SurfForecast forecast) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("surfData.dat"))) {
            oos.writeObject(forecast);
        }
    }

    /**
     * Loads the SurfForecast object from a file.
     *
     * @return The loaded SurfForecast object.
     * @throws IOException If an I/O error occurs while reading from the file.
     * @throws ClassNotFoundException If the class of the serialized object cannot be found.
     */
    public SurfForecast loadData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("surfData.dat"))) {
            return (SurfForecast) ois.readObject();
        }
    }
}
