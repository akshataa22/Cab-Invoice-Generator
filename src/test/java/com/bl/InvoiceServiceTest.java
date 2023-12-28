package com.bl;

import org.junit.Assert;
import org.junit.Test;

public class InvoiceServiceTest {
    @Test
    public void givenMultipleRidesShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };
        double fare = invoiceGenerator.calculateFare(rides);
        double expected = 30;
        Assert.assertEquals(expected, fare, 0.0);
        System.out.println("givenMultipleRidesShouldReturnTotalFare: " + fare);
    }
}
