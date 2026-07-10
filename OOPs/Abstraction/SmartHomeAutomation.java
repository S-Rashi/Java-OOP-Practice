/*
 * Project: Smart Home Automation System
 *
 * Description:
 * Demonstrates abstraction in Java using an abstract class
 * and multiple subclasses representing smart home devices.
 *
 * Concepts Used:
 * - Abstract Class
 * - Abstract Methods
 * - Method Overriding
 * - Runtime Polymorphism
 *
 */
package OOPs.Abstraction;
abstract class SmartDevice {

    int deviceId;
    String deviceName;

    SmartDevice(int deviceId, String deviceName) {
        this.deviceId = deviceId;
        this.deviceName = deviceName;
    }

    void displayDeviceInfo() {
        System.out.println("Device ID   : " + deviceId);
        System.out.println("Device Name : " + deviceName);
    }

    abstract void turnOn();

    abstract void turnOff();
}

class SmartLight extends SmartDevice {

    SmartLight(int id, String name) {
        super(id, name);
    }

    @Override
    void turnOn() {
        System.out.println("Smart Light Turned ON");
    }

    @Override
    void turnOff() {
        System.out.println("Smart Light Turned OFF");
    }
}

class SmartFan extends SmartDevice {

    SmartFan(int id, String name) {
        super(id, name);
    }

    @Override
    void turnOn() {
        System.out.println("Fan Started Rotating");
    }

    @Override
    void turnOff() {
        System.out.println("Fan Stopped");
    }
}

class SmartAirConditioner extends SmartDevice {

    SmartAirConditioner(int id, String name) {
        super(id, name);
    }

    @Override
    void turnOn() {
        System.out.println("Cooling Started");
    }

    @Override
    void turnOff() {
        System.out.println("AC Turned OFF");
    }
}

public class SmartHomeAutomation {

    public static void main(String[] args) {

        SmartLight light =
                new SmartLight(101, "Living Room Light");

        SmartFan fan =
                new SmartFan(201, "Bedroom Fan");

        SmartAirConditioner ac =
                new SmartAirConditioner(301, "Hall AC");

        light.displayDeviceInfo();
        light.turnOn();
        light.turnOff();

        System.out.println();

        fan.displayDeviceInfo();
        fan.turnOn();
        fan.turnOff();

        System.out.println();

        ac.displayDeviceInfo();
        ac.turnOn();
        ac.turnOff();
    }
}