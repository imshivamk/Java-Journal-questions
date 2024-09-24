// Q.22 Write a program to implement class and object concept.


class Car {

    String brand;
    String model;
    int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;   
        this.model = model; 
        this.year = year;  
    }

    // Method 
    public void displayInfo() {
        System.out.println("Car Information:");
        System.out.println("brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    
    public void start() {
        System.out.println(brand + " " + model + " is starting.");
    }
}

public class Q22classAndObject {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2020);

        myCar.displayInfo(); // Display car details
        myCar.start();       // Start the car
    }
}


 
