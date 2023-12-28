package com.bl;

public class InvoiceGenerator {
    private static final int costPerTime = 1;
    private static final double minimumCostPerKm = 10;
    private static final double minimumFare = 5;

    public double calculateFare(double distance, int time) {
        double totalFare = distance * minimumCostPerKm + time * costPerTime;
        if (totalFare < minimumFare) {
            return minimumFare;
        }
        return totalFare;
    }

    public InvoiceSummary calculateFare(Ride[] rides) {
        double totalFare = 0;
        int numberOfRides = 0;
        InvoiceSummary invoiceSummary = new InvoiceSummary();

        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.getDistance(), ride.getTime());
            numberOfRides++;
        }

        invoiceSummary.setTotalNumberOfRides(numberOfRides);
        invoiceSummary.setTotalFare(totalFare);
        invoiceSummary.calculateAverageFare();

        return invoiceSummary;
    }
}
