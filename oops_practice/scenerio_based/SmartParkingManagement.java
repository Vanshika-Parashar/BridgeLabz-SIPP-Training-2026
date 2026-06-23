package oops_practice.scenerio_based;

class Vehicle {
    String vehicleNumber;
    String ownerName;
    String vehicleType;

    // Constructor using this
    Vehicle(String vehicleNumber, String ownerName, String vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    void display() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println();
    }
}

public class SmartParkingManagement {

    public static void displayCars(Vehicle[] vehicles) {
        System.out.println("Cars:");
        for (Vehicle v : vehicles) {
            if (v != null && v.vehicleType.equalsIgnoreCase("Car")) {
                v.display();
            }
        }
    }

    public static void displayBikes(Vehicle[] vehicles) {
        System.out.println("Bikes:");
        for (Vehicle v : vehicles) {
            if (v != null && v.vehicleType.equalsIgnoreCase("Bike")) {
                v.display();
            }
        }
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[10];

        vehicles[0] = new Vehicle("UP85AB101", "Aman", "Car");
        vehicles[1] = new Vehicle("DL01CD102", "Riya", "Bike");
        vehicles[2] = new Vehicle("UP85EF103", "Rahul", "Car");
        vehicles[3] = new Vehicle("HR26GH104", "Priya", "Bike");
        vehicles[4] = new Vehicle("UP14IJ105", "Karan", "Car");
        vehicles[5] = new Vehicle("DL05KL106", "Neha", "Bike");
        vehicles[6] = new Vehicle("HR29MN107", "Vikas", "Car");
        vehicles[7] = new Vehicle("UP32OP108", "Sneha", "Bike");
        vehicles[8] = new Vehicle("DL08QR109", "Arjun", "Car");
        vehicles[9] = new Vehicle("HR10ST110", "Pooja", "Bike");

        displayCars(vehicles);
        displayBikes(vehicles);
    }
}
