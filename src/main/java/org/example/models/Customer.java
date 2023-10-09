package org.example.models;

/*
 * Peer Review - Sean Standen
 * I abstracted this out of MainApplication to clean up your code
 * and directory structure.  I also made your classes public so that
 * they can be used anywhere in your project.
 * */

// Customer class extending User
public class Customer extends User {
    /**
     * A customer-specific method.
     * @return 0
     */
    public short customerMethod() {
        System.out.println("This is a customer-specific method.");
        return 0;
    }
}
