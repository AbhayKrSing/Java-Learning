package Interfaces;

public class Multiple_inheritance {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.aggressive();
        bear.eat();
    }
}

interface Herbivore {
    void eat();
}

interface Carnivore {
    void eat();

    void aggressive();
}

class Bear implements Carnivore, Herbivore {
    public void eat() {
        System.out.println("Eats both plant and animal");
    }

    public void aggressive() {
        System.out.println("less agressive than carnivore animal");
    }
}