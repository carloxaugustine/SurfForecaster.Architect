package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SurfForecastTest {

    private SurfForecast surfForecast;

    @BeforeEach
    public void setUp() {
        surfForecast = new SurfForecast();
    }

    @Test
    public void testSetAndGetSurfSpotAtIndex() {
        surfForecast.setSurfSpotAtIndex(0, "Spot A");
        assertEquals("Spot A", surfForecast.getSurfSpotAtIndex(0));

        surfForecast.setSurfSpotAtIndex(9, "Spot J");
        assertEquals("Spot J", surfForecast.getSurfSpotAtIndex(9));
    }

    @Test
    public void testSetAndGetForecastAtIndex() {
        surfForecast.setForecastAtIndex(0, "Forecast A");
        assertEquals("Forecast A", surfForecast.getForecastAtIndex(0));

        surfForecast.setForecastAtIndex(9, "Forecast J");
        assertEquals("Forecast J", surfForecast.getForecastAtIndex(9));
    }

    @Test
    public void testIndexOutOfBounds() {
        assertNull(surfForecast.getSurfSpotAtIndex(10));
        assertNull(surfForecast.getForecastAtIndex(10));

        assertNull(surfForecast.getSurfSpotAtIndex(-1));
        assertNull(surfForecast.getForecastAtIndex(-1));
    }
}
