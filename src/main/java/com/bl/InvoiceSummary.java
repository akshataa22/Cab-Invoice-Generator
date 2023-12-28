package com.bl;

public class InvoiceSummary {
    private int totalNumberOfRides;
    private double totalFare;
    private double averageFarePerRide;

    public int getTotalNumberOfRides() {
        return totalNumberOfRides;
    }

    public void setTotalNumberOfRides(int totalNumberOfRides) {
        this.totalNumberOfRides = totalNumberOfRides;
    }

    public double getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(double totalFare) {
        this.totalFare = totalFare;
    }

    public double getAverageFarePerRide() {
        return averageFarePerRide;
    }

    public void calculateAverageFare() {
        if (totalNumberOfRides != 0) {
            averageFarePerRide = totalFare / totalNumberOfRides;
        }
    }
}
