package Super_keyword;

public class Super {
    public static void main(String[] args) {
        Horse h = new Horse("yellow");
        System.out.println(h.color);

    }
}

// class Animal {
// String color;

// Animal(String str) {
// this.color = str;
// System.out.println("I m Animal constructor");
// }
// }

// class Horse extends Animal {
// Horse(String str) {
// super(str);
// System.out.println("I m Horse constructor");
// }
// }

class Animal {
    String color;

    Animal() {
        System.out.println("I m Animal constructor");
    }
}

class Horse extends Animal {
    Horse(String str) {
        super(); // by default lag jata hai agar nhi lagao ge to.
        System.out.println("checking flow");
        super.color = str;
        System.out.println("I m Horse constructor");
    }
}
