/*
Project : Vehicle Rental Management System

Problem Statement:
Design a Vehicle Rental Management System using Inheritance.
Create a parent class Vehicle containing common vehicle information.
Create child classes Car, Bike and Truck that inherit the Vehicle class
and add their own unique properties.

Concepts Practiced:
- Inheritance
- Constructors
- super Keyword
- Code Reusability
- Hierarchical Inheritance
*/

package OOPs.Inheritance;

class Vehicle {

    int vehicleId;
    String brand;
    String model;
    double rentalPrice;

    Vehicle(int vehicleId,
            String brand,
            String model,
            double rentalPrice) {

        this.vehicleId = vehicleId;
        this.brand = brand;
        this.model = model;
        this.rentalPrice = rentalPrice;
    }

    void displayVehicleInfo() {

        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Rental Price/Day : ₹" + rentalPrice);
    }
}

class Car extends Vehicle {

    int seats;
    String fuelType;

    Car(int vehicleId,
        String brand,
        String model,
        double rentalPrice,
        int seats,
        String fuelType) {

        super(vehicleId, brand, model, rentalPrice);

        this.seats = seats;
        this.fuelType = fuelType;
    }

    void displayCarInfo() {

        displayVehicleInfo();

        System.out.println("Seats : " + seats);
        System.out.println("Fuel Type : " + fuelType);
    }
}

class Bike extends Vehicle {

    int engineCapacity;
    boolean hasHelmet;

    Bike(int vehicleId,
         String brand,
         String model,
         double rentalPrice,
         int engineCapacity,
         boolean hasHelmet) {

        super(vehicleId, brand, model, rentalPrice);

        this.engineCapacity = engineCapacity;
        this.hasHelmet = hasHelmet;
    }

    void displayBikeInfo() {

        displayVehicleInfo();

        System.out.println("Engine Capacity : " + engineCapacity + " cc");
        System.out.println("Helmet Included : " + hasHelmet);
    }
}

class Truck extends Vehicle {

    double loadCapacity;
    int axles;

    Truck(int vehicleId,
          String brand,
          String model,
          double rentalPrice,
          double loadCapacity,
          int axles) {

        super(vehicleId, brand, model, rentalPrice);

        this.loadCapacity = loadCapacity;
        this.axles = axles;
    }

    void displayTruckInfo() {

        displayVehicleInfo();

        System.out.println("Load Capacity : " + loadCapacity + " Tons");
        System.out.println("Number of Axles : " + axles);
    }
}

public class VehicleRentalSystem {

    public static void main(String[] args) {

        Car car = new Car(
                101,
                "Hyundai",
                "Creta",
                2500,
                5,
                "Petrol");

        Bike bike = new Bike(
                201,
                "Royal Enfield",
                "Classic 350",
                900,
                350,
                true);

        Truck truck = new Truck(
                301,
                "Tata",
                "Signa",
                7000,
                18,
                4);

        System.out.println("===== CAR DETAILS =====");
        car.displayCarInfo();

        System.out.println();

        System.out.println("===== BIKE DETAILS =====");
        bike.displayBikeInfo();

        System.out.println();

        System.out.println("===== TRUCK DETAILS =====");
        truck.displayTruckInfo();
    }
}