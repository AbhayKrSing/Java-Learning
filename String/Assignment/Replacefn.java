package String.Assignment;

public class Replacefn {
    public static void main(String[] args) {
        String str = "ApnaCollegeApna".replace("Apna", ""); // replace all occurences
        System.out.println(str);
        String str2 = "ApnaCollege".replace('l', 'x'); // replace all occurences
        System.out.println(str2);
        String str3 = "AApnaCollegeApna".replaceAll("Apna", "y"); // replace all occurences
        System.out.println(str3);
        String str4 = "AApnaCollegeApna".replaceFirst("Apna", "x"); // replace first occurences
        System.out.println(str4);
    }
}
