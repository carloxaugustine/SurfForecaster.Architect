package org.example;

import org.example.controllers.ArrayOperations;
import org.example.models.*;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class MainApplicationTest {

    @Test
    public void testImportData() {
        DataImport dataImport = new SurfLineDataImport();
        ArrayList<String> data = dataImport.importData();

        ArrayList<String> expectedData = new ArrayList<>();
        expectedData.add("Fake Data 1");
        expectedData.add("Fake Data 2");

        assertEquals(expectedData, data);
    }

    @Test
    public void testSharedMethod() {
        User user = new User();
        assertNull(user.sharedMethod());
    }

    @Test
    public void testAdminMethod() {
        Admin admin = new Admin();
        assertEquals(0, admin.adminMethod());
    }

    @Test
    public void testCustomerMethod() {
        Customer customer = new Customer();
        assertEquals(0, customer.customerMethod());
    }

    @Test
    public void testArrayOperations1D() {
        ArrayOperations arrayOps = new ArrayOperations();
        int[] arr = {1, 2, 3, 4, 5};

        assertEquals(3, arrayOps.getAtIndex(arr, 2));

        arrayOps.setAtIndex(arr, 2, 10);
        assertEquals(10, arrayOps.getAtIndex(arr, 2));
    }

    @Test
    public void testArrayOperations2D() {
        ArrayOperations arrayOps = new ArrayOperations();
        int[][] arr = {{1, 2}, {3, 4}, {5, 6}};

        assertEquals(4, arrayOps.getAtIndex(arr, 1, 1));

        arrayOps.setAtIndex(arr, 1, 1, 10);
        assertEquals(10, arrayOps.getAtIndex(arr, 1, 1));
    }
}
