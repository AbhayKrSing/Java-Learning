
public class Inheritance {
    public static void main(String[] args) {
        Fish shark = new Fish();
        shark.swim();
        shark.eat();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

// Derived class
class Fish extends Animal { // single level inheritance .
    int fins;

    void swim() {
        System.out.println("Swims in water");
    }
}