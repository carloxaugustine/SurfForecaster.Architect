package org.example;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SurfForecastGUI extends Application {

    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(5);
        grid.setHgap(5);

        Label destinationLabel = new Label("Select Destination:");
        ComboBox<String> destinationComboBox = new ComboBox<>();
        ObservableList<String> destinations = FXCollections.observableArrayList("Dana Point", "Lower Trestles", "Trails");
        destinationComboBox.setItems(destinations);
        destinationComboBox.setValue("Dana Point");

        Label waveHeightLabel = new Label("Wave Height (ft):");
        Label waveHeightValue = new Label("Not Available");

        Label windSpeedLabel = new Label("Wind Speed (mph):");
        Label windSpeedValue = new Label("Not Available");

        Label tideLabel = new Label("Tide (ft):");
        Label tideValue = new Label("Not Available");

        Button getForecastButton = new Button("Get Forecast");
        getForecastButton.setOnAction(e -> {
            String selectedDestination = destinationComboBox.getValue();
            // For demonstration, setting random values based on the selected destination
            double waveHeight = Math.random() * 10;
            double windSpeed = Math.random() * 20;
            double tide = Math.random() * 5;

            waveHeightValue.setText(String.format("%.2f ft", waveHeight));
            windSpeedValue.setText(String.format("%.2f mph", windSpeed));
            tideValue.setText(String.format("%.2f ft", tide));
        });

        grid.add(destinationLabel, 0, 0);
        grid.add(destinationComboBox, 1, 0);
        grid.add(waveHeightLabel, 0, 1);
        grid.add(waveHeightValue, 1, 1);
        grid.add(windSpeedLabel, 0, 2);
        grid.add(windSpeedValue, 1, 2);
        grid.add(tideLabel, 0, 3);
        grid.add(tideValue, 1, 3);
        grid.add(getForecastButton, 0, 4, 2, 1);

        Scene scene = new Scene(grid, 300, 200);
        primaryStage.setTitle("Surf Forecast");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
