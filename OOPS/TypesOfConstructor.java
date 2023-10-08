
public class TypesOfConstructor {
    // 1.Non Parameterized
    // 2.Parameterized
    // 3.Copy constructor (later in next code/section)
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.name);

        Student s2 = new Student("Abhay");
        System.out.println(s2.name);

        Student s3 = new Student(345);
        System.out.println(s3.rollno);

        Student s4 = new Student("Abhay Kumar Singh", 3);
        System.out.println(s4.name);
        System.out.println(s4.rollno);
    }
}

class Student {
    String name;
    int rollno;

    // This phenomena is also called constructor overloading.
    Student() {
        System.out.println("I m Student Constructor");
    }

    Student(String name) {
        this.name = name;
    }

    Student(int rollno) {
        this.rollno = rollno;
    }

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

}
