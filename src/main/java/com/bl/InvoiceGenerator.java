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

    public double calculateFare(Ride[] ride){
        double totolFare =0;
        for(Ride r : ride){
            totolFare += this.calculateFare(r.getDistance(),r.getTime());
        }
        return totolFare;
    }
}
