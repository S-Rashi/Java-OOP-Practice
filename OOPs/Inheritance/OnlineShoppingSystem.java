/*
 * ONLINE SHOPPING SYSTEM
 * ----------------------
 * A Java application demonstrating the Inheritance principle of Object-Oriented
 * Programming. The Product class serves as the parent class, while Electronics,
 * Clothing, and Books extend it to represent different product categories.
 *
 * This project illustrates:
 * • Hierarchical Inheritance
 * • Constructor Inheritance using super()
 * • Code Reusability
 * • Parent-Child Class Relationships
 */

package OOPs.Inheritance;

 class Product{
    int productId;
    String productName;
    double price;

    Product(int productId,String productName,double price){
        this.productId = productId;
        this.productName = productName;
        this.price = price;
    }

    void displayProduct(){
        System.out.println("ProductID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
}

class Electronics extends Product{
    int warrantyPeriod;

    Electronics(int productId,String productName,double price,int warrantyPeriods){
        super(productId, productName, price);
        this.warrantyPeriod = warrantyPeriods;
    }

    void displayElectronics(){
        displayProduct();
        System.out.println("Warranty Period: " + warrantyPeriod + "years");
    }

}

class Clothing extends Product{
    String size;
    String brand;
    

    Clothing(int productId,String productName,double price,String size,String brand){
        super(productId, productName, price);
        this.size = size;
        this.brand = brand; 
    }
    void displayClothing(){
        displayProduct();
        System.out.println("Size: " + size);
        System.out.println("Brand: " + brand);
    }
}

class Books extends Product{
    String author;
    String genre;
    
    Books(int productId,String productName,double price,String author,String genre){
        super(productId, productName, price);
        this.author = author;
        this.genre = genre;
    }
    void displayBooks(){
        displayProduct();
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
    }
}
public class OnlineShoppingSystem {
    public static void main(String[] args){
        Electronics laptop =
            new Electronics(
                 101,
                 "Laptop",
                 70000,
                 2);

        Clothing tshirt =
            new Clothing(
                 102,
                 "T-Shirt",
                 1200,
                 "L",
                 "Nike");

        Books book = 
            new Books(
                103,
                "Atomic Habits",
                499,
                "James Clear",
                "Self Help");

        laptop.displayElectronics();

        System.out.println();

        tshirt.displayClothing();

        System.out.println();

        book.displayBooks();
    }
}