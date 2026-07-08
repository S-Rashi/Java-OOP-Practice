/*
 * Project: Payment Gateway System
 *
 * Description:
 * This project demonstrates Runtime Polymorphism in Java using a payment
 * processing system. A common parent class (Payment) defines a generic
 * payment method, while different payment types such as Credit Card,
 * UPI, and Wallet override the method to provide their own payment
 * processing behavior.
 *
 * OOP Concepts Demonstrated:
 * - Runtime Polymorphism
 * - Method Overriding
 * - Dynamic Method Dispatch
 * - Code Reusability
 *
 
 */

package OOPs.Polymorphism;
class Payment {

    void pay(double amount) {
        System.out.println("Processing Payment...");
    }
}

class CreditCardPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount
            + " using Credit Card.");
    }
}

class UPIPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount
            + " using UPI.");
    }
}

class WalletPayment extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid ₹" + amount
            + " using Wallet.");
    }
}
public class PaymentGatewaySystem {
    public static void main(String[] args) {

        Payment[] payments = {
        new CreditCardPayment(),
        new UPIPayment(),
        new WalletPayment()

        };

        for (Payment p : payments) {
            p.pay(5000);
        }

    }
}