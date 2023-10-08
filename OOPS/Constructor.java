public class Constructor {
    public static void main(String[] args) {
        Students s1 = new Students("Abhay");
        System.out.println(s1.name);
    }
}

class Students {
    String name;
    int rollno;

    Students(String name) {
        System.out.println("Constructor is called");
        this.name = name; // Intialization using manual constructor
    }

}
