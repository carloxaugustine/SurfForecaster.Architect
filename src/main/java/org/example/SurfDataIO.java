package org.example;

import java.io.*;

public class SurfDataIO {
    public void saveData(SurfForecast forecast) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("surfData.dat"))) {
            oos.writeObject(forecast);
        }
    }

    public SurfForecast loadData() throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("surfData.dat"))) {
            return (SurfForecast) ois.readObject();
        }
    }
}
