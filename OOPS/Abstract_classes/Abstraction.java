package Abstract_classes;

public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.legs();
        h.eat();
        System.out.println(h.color); // by default brown value of color property se initiat hua.

        Hens he = new Hens();
        he.legs();
        he.eat();
        System.out.println(he.color);

        he.color = "red";
        System.out.println(he.color);
        System.out.println(h.color);

        // Animal A=new Animal(); //cannot make instances of abstract classes

    }
}

abstract class Animal {
    String color;

    Animal() {
        this.color = "brown";
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void legs(); // only idea not implementation (core concept of abstraction)
}

class Horse extends Animal {
    void legs() {
        System.out.println("I have 4 legs");
    }
}

class Hens extends Animal {
    void legs() {
        System.out.println("I have 2 legs");
    }
}
