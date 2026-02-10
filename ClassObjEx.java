package javaPrac;
//Define a class Student with attributes: name, rollNo, and marks. Create an object and display the details.
class Student {
    String name;
    int rollNo;
    int marks;

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}

//Create a class Car with variables brand, model, and price. Write a program to create two objects and print their details.
class Car {
    String brand;
    String model;
    double price;

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("--------------------");
    }
}
//Define a class Rectangle with length and width. Create an object and calculate the area.
class Rectangle {
    int length;
    int width;

    void calculateArea() {
        int area = length * width;
        System.out.println("Area of Rectangle: " + area);
    }
}
public class ClassObjEx {
    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Radhika";
        s1.rollNo = 101;
        s1.marks = 85;

        s1.displayDetails();
        
        System.out.println("lnlnln");
        
        
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Innova";
        c1.price = 2500000;

        Car c2 = new Car();
        c2.brand = "Hyundai";
        c2.model = "i20";
        c2.price = 1200000;

        c1.displayDetails();
        c2.displayDetails();
        
        System.out.println("\n\n\n");
        
        
        Rectangle r1 = new Rectangle();

        r1.length = 10;
        r1.width = 5;

        r1.calculateArea();
    }
}
