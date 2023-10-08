public class MethodOveriding {
    public static void main(String[] args) {
        Deer dr = new Deer();
        dr.eat();
    }
}

// Example of methodOveriding
class Animal {
    void eat() {
        System.out.println("Eat anything");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Eat grass");
    }
}