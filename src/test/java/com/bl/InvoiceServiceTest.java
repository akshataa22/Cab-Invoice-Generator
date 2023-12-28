package com.bl;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class InvoiceServiceTest {
    @Test
    public void givenMultipleRidesShouldReturnInvoiceSummary() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1)
        };

        InvoiceSummary invoiceSummary = invoiceGenerator.calculateFare(rides);
        InvoiceSummary expected = new InvoiceSummary();
        expected.setTotalNumberOfRides(2);
        expected.setTotalFare(30.0);
        expected.calculateAverageFare();

        assertEquals(expected.getTotalNumberOfRides(), invoiceSummary.getTotalNumberOfRides());
        assertEquals(expected.getTotalFare(), invoiceSummary.getTotalFare(), 0.0);
        assertEquals(expected.getAverageFarePerRide(), invoiceSummary.getAverageFarePerRide(), 0.0);
        System.out.println("Total number of rides: " + invoiceSummary.getTotalNumberOfRides());
        System.out.println("Total fare: " + invoiceSummary.getTotalFare());
        System.out.println("Total average fare per ride: " + invoiceSummary.getAverageFarePerRide());
    }
}
