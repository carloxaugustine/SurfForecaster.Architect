package org.example.models;

/*
 * Peer Review - Sean Standen
 * I abstracted this out of MainApplication to clean up your code
 * and directory structure.  I also made your classes public so that
 * they can be used anywhere in your project.
 * */

// Base User class
public class User {
    /**
     * A shared method for all users.
     * @return null
     */
    public Object sharedMethod() {
        System.out.println("This is a shared method.");
        return null;
    }
}
