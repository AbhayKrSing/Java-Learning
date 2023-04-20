import java.util.*;

public class area_of_circle {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter radius of circle :");
            float radius=sc.nextFloat();
            System.out.print("Radius is :");
            System.out.println(radius);
            float area=3.14f*radius*radius;      //Here error was comming if we don't convert double value into float value.
            System.out.print("Area is :");
            System.out.println(area);
        }
    }
}
//java automatically consider a decimal value a double type ,so convert double type to float type we have to put f with decimal value.