package org.example.models;

import java.util.ArrayList;

/*
 * Peer Review - Sean Standen
 * I abstracted this out of MainApplication to clean up your code
 * and directory structure.  I also made your classes public so that
 * they can be used anywhere in your project.
 * */

// Interface for Data Import
public interface DataImport {
    /**
     * Imports data.
     * @return An ArrayList containing the imported data.
     */
    ArrayList<String> importData();
}

