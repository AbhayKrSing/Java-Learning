public class ArrayAsAfunction_arguments {
    public static void Update(int marks[]) {
        marks[1] = 67; // Here marks is a pointer.Basically call by reference used when array passed as
                       // an function argument
    }

    public static void main(String[] args) {
        int marks[] = { 34, 50, 70 };
        Update(marks);
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
    }
}
