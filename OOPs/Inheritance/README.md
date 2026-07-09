# Inheritance

This folder contains Java projects demonstrating the Inheritance principle of Object-Oriented Programming (OOP). Each project models a real-world scenario where child classes inherit common properties and behaviors from a parent class.

## Projects

# 1. Online Shopping System

A simple shopping system that demonstrates hierarchical inheritance.

# Class Hierarchy

```
Product
├── Electronics
├── Clothing
└── Books
```

# Concepts Demonstrated

- Inheritance
- Constructors using `super()`
- Code reusability
- Hierarchical inheritance
- Method organization

# Output

The program displays product details for:

- Electronics
- Clothing
- Books

# 2. Vehicle Rental Management System
This project demonstrates the concept of Inheritance in Java using a real-world Vehicle Rental Management System.

Different types of vehicles share common properties such as Vehicle ID, Brand, Model, and Rental Price. Instead of repeating these properties in every class, a parent class (`Vehicle`) is created, and child classes inherit the common features while adding their own specific details.

## OOPs Concept used

This project uses Hierarchical Inheritance.


             Vehicle
          /      |      \
       Car      Bike    Truck


## Concepts Covered

- Classes & Objects
- Constructors
- Constructor Chaining
- super Keyword
- Hierarchical Inheritance
- Code Reusability

## Project Features

### Vehicle

- Vehicle ID
- Brand
- Model
- Rental Price

### Car

- Number of Seats
- Fuel Type

### Bike

- Engine Capacity
- Helmet Availability

### Truck

- Load Capacity
- Number of Axles

## Learning Outcomes

- Understand parent-child relationships
- Eliminate duplicate code using inheritance
- Learn constructor chaining using `super`
- Design real-world object-oriented applications

# Future Enhancements

- Method Overriding
- Runtime Polymorphism
- Customer Rental System
- Bill Generation
- Rental Duration Calculation