
public class CopyConstructor {
    public static void main(String[] args) {
        Stud s1 = new Stud();
        s1.name = "ABhay";
        s1.rollno = 4895;
        s1.marks = new int[3];
        s1.marks[0] = 12;
        s1.marks[1] = 10;
        s1.marks[2] = 8;
        Stud s2 = new Stud(s1); // copying
        s1.marks[1] = 69;// due to array passed as reference s2.marks[1] value will change.
        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Stud {
    String name;
    int rollno;
    int marks[];

    Stud() {
        System.out.println("Hello I m a constructor");
    }

    // Stud(Stud s1) { // copy constructor(shallow copy constructor)
    // this.marks = new int[s1.marks.length];
    // this.name = s1.name;
    // this.rollno = s1.rollno;
    // this.marks = s1.marks; // array is passed as a reference.(So if s1.marks
    // value change s2.marks value also changed)
    // }
    Stud(Stud s1) { // copy constructor(deep copy constructor)
        this.marks = new int[s1.marks.length];
        this.name = s1.name;
        this.rollno = s1.rollno;
        for (int i = 0; i < this.marks.length; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
