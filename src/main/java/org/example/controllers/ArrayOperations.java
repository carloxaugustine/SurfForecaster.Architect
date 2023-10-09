package org.example.controllers;

/*
 * Peer Review - Sean Standen
 * I abstracted this out of MainApplication to clean up your code
 * and directory structure.  I also made your classes public so that
 * they can be used anywhere in your project.
 * */

// Class for Array Operations (Module 1 & 2)
public class ArrayOperations {
    /**
     * Displays the array operations menu.
     */
    public void showMenu() {
        System.out.println("Array Operations Menu:");
        System.out.println("1. Get element at index (1D array)");
        System.out.println("2. Set element at index (1D array)");
        System.out.println("8. Get element at index (2D array)");
        System.out.println("9. Set element at index (2D array)");
        System.out.println("Enter your choice for array operations:");
    }
    /**
     * Gets the element at the given index in a 1D array.
     * @param arr The array.
     * @param index The index.
     * @return The element at the given index.
     */
    public int getAtIndex(int[] arr, int index) {
        return arr[index];
    }

    /**
     * Sets the element at the given index in a 1D array.
     * @param arr The array.
     * @param index The index.
     * @param value The value to set.
     */
    public void setAtIndex(int[] arr, int index, int value) {
        arr[index] = value;
    }
    /**
     * Gets the element at the given row and column in a 2D array.
     * @param arr The 2D array.
     * @param row The row.
     * @param col The column.
     * @return The element at the given row and column.
     */
    public int getAtIndex(int[][] arr, int row, int col) {
        return arr[row][col];
    }
    /**
     * Sets the element at the given row and column in a 2D array.
     * @param arr The 2D array.
     * @param row The row.
     * @param col The column.
     * @param value The value to set.
     */
    public void setAtIndex(int[][] arr, int row, int col, int value) {
        arr[row][col] = value;
    }
}

