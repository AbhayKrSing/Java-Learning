package String.Assignment;

import java.util.Arrays;

public class Anagrams {
    public static void main(String[] args) {
        String str1 = "raghce";
        String str2 = "caregh";
        // boolean anagrams = true; //Abhay's logic
        // char ch1[] = str1.toCharArray();
        // char ch2[] = str2.toCharArray();
        // Arrays.sort(ch1);
        // Arrays.sort(ch2);
        // for (int i = 0; i < (n1 > n2 ? n2 : n1); i++) {
        // if (ch1[i] != ch2[i]) {
        // anagrams = false;
        // break;
        // }
        // }
        // if (anagrams) {
        // System.out.println("Anagrams");
        // } else {
        // System.out.println("Not Anagrams");
        // }
        str1 = str1.toLowerCase(); // //Convert Strings to lowercase. Why? so thatwe don't have to checkseparately
                                   // for lower & uppercase.
        str2 = str2.toLowerCase();
        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if (Arrays.equals(ch1, ch2)) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
}
