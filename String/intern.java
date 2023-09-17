package String;

public class intern {
    public static void main(String[] args) {
        String name = "Amit".intern();
        String name2 = "Amit"; // .intern() is by default here
        String name3 = new String("Amit");
        String name4 = new String("Amit").intern(); // .intern() makes string object in String constant pool.
        System.out.println(name == name2);
        System.out.println(name == name3);
        System.out.println(name == name4);
    }
}
