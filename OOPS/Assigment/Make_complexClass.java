package Assigment;

public class Make_complexClass {
    public static void main(String[] args) {
        Complex a = new Complex(3, 2);
        Complex b = new Complex(4, 6);
        Complex result = Complex.mult(a, b);
        result.PrintComplex();

    }

}

class Complex {
    int real;
    int img;

    public Complex(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public static Complex add(Complex a, Complex b) {
        return new Complex(a.real + b.real, a.img + b.img);
    }

    public static Complex subs(Complex a, Complex b) {
        return new Complex(a.real - b.real, a.img - b.img);
    }

    public static Complex mult(Complex a, Complex b) {
        return new Complex(a.real * b.real - a.img * b.img, a.real * b.img + a.img * b.real);
    }

    void PrintComplex() {
        System.out.println(this.real + (this.img > 0 ? "+" : "") + this.img + "j");
    }
}
