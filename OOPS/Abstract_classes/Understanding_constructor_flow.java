package Abstract_classes;

public class Understanding_constructor_flow {
    // Animal->Horse->Mustand
    public static void main(String[] args) {
        Mustands ms = new Mustands();
        ms.legs();
        ms.eat();
        System.out.println(ms.color); // by default brown value of color property se initiat hua.

    }
}

abstract class Animals {
    String color;

    Animals() {
        this.color = "brown";
        System.out.println("I m Animal Constructor");
    }

    void eat() {
        System.out.println("Animal eats");
    }

    abstract void legs(); // only idea not implementation (core concept of abstraction)
}

class Horses extends Animals {
    Horses() {
        System.out.println("I m Horse Constuctor");
    }

    void legs() {
        System.out.println("I have 4 legs");
    }
}

class Mustands extends Horses {
    Mustands() {
        System.out.println("I m Mustand Constructor");
    }
}