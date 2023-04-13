import java.util.*;

public class input {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            // String input1 = s.next();  //As it encounters space it it stop reading
            String input2=s.nextLine();
            int input3=s.nextInt();
            float input4=s.nextFloat();

            // System.out.println(input1);
            System.out.println(input2);
            System.out.println(input3);
            System.out.println(input4);
        }
    }
}
