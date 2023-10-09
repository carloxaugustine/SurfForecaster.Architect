package org.example.models;

import java.util.ArrayList;

/*
 * Peer Review - Sean Standen
 * I abstracted this out of MainApplication to clean up your code
 * and directory structure.  I also made your classes public so that
 * they can be used anywhere in your project.
 * */

/**
 * Implementation of DataImport for importing surf line data.
 */
public class SurfLineDataImport implements DataImport {
    /**
     * Imports fake surf line data for demonstration.
     * @return An ArrayList containing the imported data.
     */
    public ArrayList<String> importData() {
        // Fake data for demonstration
        ArrayList<String> data = new ArrayList<>();
        data.add("Fake Data 1");
        data.add("Fake Data 2");
        return data;
    }
}
