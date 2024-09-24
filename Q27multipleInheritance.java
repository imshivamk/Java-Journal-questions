// First interface
interface Animal {
    void makeSound(); // Abstract method for sound
}

// Second interface
interface Swimmer {
    void swim(); // Abstract method for swimming
}

// Class that implements both interfaces
class Duck implements Animal, Swimmer {
    @Override
    public void makeSound() {
        System.out.println("Duck says: Quack!");
    }

    @Override
    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

public class Q27multipleInheritance {
    public static void main(String[] args) {
        Duck duck = new Duck(); // Create a Duck object
        duck.makeSound(); // Call method from Animal interface
        duck.swim();      // Call method from Swimmer interface
    }
}
