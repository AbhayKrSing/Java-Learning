import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
        }
        int a= (int)45.7575f;  //conversion explicitily done by user even after lossy conversion take place.
        System.out.println(a);

        //char -->int,float,long,double(due to ascii value(watch ascii table for more info))
        char b='c';
        int c=b;
        System.out.println(c);

    }
}
