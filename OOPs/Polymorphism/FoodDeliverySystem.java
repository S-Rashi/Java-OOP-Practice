/*
 * Project: Food Delivery System
 *
 * Description:
 * This project demonstrates Runtime Polymorphism in Java through a food
 * delivery application. A common Restaurant class provides a generic
 * delivery charge method, while different restaurants such as Dominos,
 * McDonalds, and KFC override the method to calculate delivery charges
 * according to their own pricing policies.
 *
 * OOP Concepts Demonstrated:
 * - Runtime Polymorphism
 * - Method Overriding
 * - Dynamic Method Dispatch
 * - Flexible Object-Oriented Design
 *
 
 */

package OOPs.Polymorphism;
//Food delivery system
class Resturant{
    void displayResturant(){
        System.out.println("Resturant Delivery");
    }

    void calculateDeliverycharge(int Distance){
        System.out.println("Delivery Charge" );
    }
}
class Dominos extends Resturant{
    void calculateDeliverycharge(int Distance){
        int charge = Distance * 10;
        System.out.println("Dominos charge: " + charge);
    }
}
class McDonalds extends Resturant{
    void calculateDeliverycharge(int Distance){
        int charge = (Distance * 8) + 20;
        System.out.println("McDonalds Charge: " + charge);
    }
}
class KFC extends Resturant{
    void calculateDeliverycharge(int Distance){
        int orderamount = 400;
        if (orderamount > 500){
            System.out.println("KFC Free Delivery");
        }
        else 
        {
            int charge = Distance * 15;
            System.out.println("KFC Charge: " + charge);
        }  
        
    }
}

public class FoodDeliverySystem{
    public static void main(String[] args){
        Resturant r ;
        r = new Dominos();
        r.calculateDeliverycharge(5);

        r = new McDonalds();
        r.calculateDeliverycharge(5);

        r = new KFC();
        r.calculateDeliverycharge(5);
    }
}