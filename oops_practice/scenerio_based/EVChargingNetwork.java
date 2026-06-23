package oops_practice.scenerio_based;

class ChargingStation {

    // Static Variables
    static int totalStations = 0;
    static double electricityRate = 8.5; // per unit

    // Instance Variables
    int stationId;
    double unitsConsumed;

    // Constructor
    ChargingStation(int stationId, double unitsConsumed) {
        this.stationId = stationId;
        this.unitsConsumed = unitsConsumed;
        totalStations++;
    }

    // Calculate Bill
    double calculateBill() {
        return unitsConsumed * electricityRate;
    }

    // Display Details
    void displayStationDetails() {
        System.out.println("Station ID: " + stationId);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Electricity Rate: " + electricityRate);
        System.out.println("Bill Amount: ₹" + calculateBill());
        System.out.println();
    }
}

public class EVChargingNetwork {
    public static void main(String[] args) {

        // Create 5 charging stations
        ChargingStation s1 = new ChargingStation(101, 120);
        ChargingStation s2 = new ChargingStation(102, 150);
        ChargingStation s3 = new ChargingStation(103, 200);
        ChargingStation s4 = new ChargingStation(104, 175);
        ChargingStation s5 = new ChargingStation(105, 90);

        System.out.println("Total Stations: " + ChargingStation.totalStations);
        System.out.println();

        // Display details
        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();

        // Change electricity rate
        ChargingStation.electricityRate = 10.0;

        System.out.println("After Updating Electricity Rate");
        System.out.println("--------------------------------");

        s1.displayStationDetails();
        s2.displayStationDetails();
        s3.displayStationDetails();
        s4.displayStationDetails();
        s5.displayStationDetails();
    }
}
