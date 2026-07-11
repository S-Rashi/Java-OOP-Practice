/*
 * ============================================================
 * Project: Delivery Partner Management System
 * ============================================================
 *
 * Description:
 * This project simulates a delivery management system where
 * different delivery partners such as Bike, Bicycle, and Drone
 * implement a common DeliveryService interface. Each partner
 * provides its own way of accepting orders, calculating
 * delivery charges, and delivering orders while sharing common
 * partner information through an abstract class.
 *
 * Key Concepts:
 * - Interfaces
 * - Interface Implementation
 * - Abstract Class
 * - Method Overriding
 * - Runtime Polymorphism
 *
 * ============================================================
 */

package OOPs.Interface;

interface DeliveryService {

    void acceptOrder();

    void deliverOrder();

    double calculateDeliveryFee(double distance);

}
abstract class DeliveryPartner {

    int partnerId;
    String partnerName;

    DeliveryPartner(int partnerId, String partnerName) {

        this.partnerId = partnerId;
        this.partnerName = partnerName;
    }

    void displayPartnerInfo() {

        System.out.println("Partner ID   : " + partnerId);
        System.out.println("Partner Name : " + partnerName);
    }
}
class BikeDelivery extends DeliveryPartner implements DeliveryService {

    BikeDelivery(int id, String name) {
        super(id, name);
    }

    @Override
    public void acceptOrder() {
        System.out.println("Bike Partner accepted the order.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered using Bike.");
    }

    @Override
    public double calculateDeliveryFee(double distance) {
        return distance * 12;
    }
}

class BicycleDelivery extends DeliveryPartner implements DeliveryService {

    BicycleDelivery(int id, String name) {
        super(id, name);
    }

    @Override
    public void acceptOrder() {
        System.out.println("Bicycle Partner accepted the order.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered using Bicycle.");
    }

    @Override
    public double calculateDeliveryFee(double distance) {
        return distance * 8;
    }
}

class DroneDelivery extends DeliveryPartner implements DeliveryService {

    DroneDelivery(int id, String name) {
        super(id, name);
    }

    @Override
    public void acceptOrder() {
        System.out.println("Drone accepted the order automatically.");
    }

    @Override
    public void deliverOrder() {
        System.out.println("Order delivered by Drone.");
    }

    @Override
    public double calculateDeliveryFee(double distance) {
        return distance * 18;
    }
}

public class DeliveryPartnerManagement {

    public static void main(String[] args) {

        DeliveryService[] partners = {

                new BikeDelivery(101, "Rahul"),
                new BicycleDelivery(102, "Aman"),
                new DroneDelivery(103, "Auto Drone")

        };

        DeliveryPartner[] info = {

                new BikeDelivery(101, "Rahul"),
                new BicycleDelivery(102, "Aman"),
                new DroneDelivery(103, "Auto Drone")

        };

        for (int i = 0; i < partners.length; i++) {

            info[i].displayPartnerInfo();

            partners[i].acceptOrder();

            System.out.println("Delivery Fee : ₹"
                    + partners[i].calculateDeliveryFee(10));

            partners[i].deliverOrder();

            System.out.println("--------------------------");
        }

    }
}
