package org.example.models;

/*
 * Peer Review - Sean Standen
 * I abstracted this out of MainApplication to clean up your code
 * and directory structure.  I also made your classes public so that
 * they can be used anywhere in your project.
 * */

// Admin class extending User
public class Admin extends User {
    /**
     * An admin-specific method.
     * @return 0
     */
    public short adminMethod() {
        System.out.println("This is an admin-specific method.");
        return 0;
    }
}
