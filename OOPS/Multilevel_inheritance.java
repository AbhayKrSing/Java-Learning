public class Multilevel_inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.color = "black";
        dog.eat();
        dog.petname = "doby";
        dog.legs = 4;
        dog.name = "DOG";
        System.out.println(dog.color + " " + dog.petname + " " + dog.legs + " breed " + dog.name);
    }
}

// Example of multilevel inheritance
class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammals extends Animal {
    int breed;
    String name;

}

class Dog extends Mammals {
    String petname;
    int legs;
}
