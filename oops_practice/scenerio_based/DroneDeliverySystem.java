package oops_practice.scenerio_based;

class Drone {

    // Instance Variables
    int droneId;
    int batteryPercentage;

    // Static Variable
    static String companyName = "Sky Logistics";

    // Constructor
    Drone(int droneId, int batteryPercentage) {
        this.droneId = droneId;
        this.batteryPercentage = batteryPercentage;
    }

    // Method to start delivery
    void startDelivery() {
        if (batteryPercentage >= 20) {
            System.out.println("Drone " + droneId + " started delivery.");
        } else {
            System.out.println("Drone " + droneId + " has low battery. Delivery cannot start.");
        }
    }

    // Method to display status
    void displayStatus() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Drone ID: " + droneId);
        System.out.println("Battery Percentage: " + batteryPercentage + "%");
        System.out.println();
    }
}

public class DroneDeliverySystem {
    public static void main(String[] args) {

        // Creating multiple drones
        Drone d1 = new Drone(101, 80);
        Drone d2 = new Drone(102, 15);
        Drone d3 = new Drone(103, 60);

        // Start deliveries
        d1.startDelivery();
        d2.startDelivery();
        d3.startDelivery();

        System.out.println();

        // Display status
        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();

        // Verify static variable is shared
        System.out.println("Changing company name...\n");

        Drone.companyName = "Express Drone Services";

        d1.displayStatus();
        d2.displayStatus();
        d3.displayStatus();
    }
}
