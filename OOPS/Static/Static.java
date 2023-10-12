package Static;

public class Static {
    public static void main(String[] args) {
        Student s1 = new Student("Abhay", 3, "MVM");
        System.out.println(s1.schoolName);

        Student s2 = new Student("kishen", 32, "saxschool");
        System.out.println(s2.schoolName);
        System.out.println(s1.schoolName);
        System.out.println(s1.percentage(45, 78, 90));
        System.out.println(s2.percentage(90, 78, 90));

        Student s3 = new Student("Yash", 39);
        System.out.println(s3.schoolName);
        // schoolName changed for all instances.

        System.out.println(Student.schoolName + "2nd"); // static properties or method can directly accessed by both
                                                        // class and object.
    }
}

class Student {
    String name; // non static field(to make static field make it static)
    int rollno;
    static String schoolName; // just use reference context(just like array) to understand it(or see notes)

    Student(String name, int rollno, String schoolName) {
        this.name = name;
        this.rollno = rollno;
        this.schoolName = schoolName;
    }

    Student(String name, int rollno) {
        this.name = name;
        this.rollno = rollno;
    }

    static int percentage(int phy, int chem, int maths) {
        return ((phy + chem + maths) * 100) / 300;
    }

    void setName(String name, String schoolName) { // not a static context(to make static context make it static)
        this.name = name; // Cannot use this in a static context(error when setName method become static)
        this.schoolName = schoolName;
    }

    void getName() {
        System.out.println(this.name);
    }

}
