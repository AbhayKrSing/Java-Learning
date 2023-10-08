
public class MethodOverloading {
    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.sum(1, 3));
        System.out.println(cl.sum((float) 1.5, (float) 5.7));
        System.out.println(cl.sum(5, 8, 9));
    }
}

// Example of method overloading.
class Calculator {
    int sum(int a, int b) {
        return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}