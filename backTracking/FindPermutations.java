package backTracking;

public class FindPermutations {
    public static void getPermutation(String str, String ans) {
        // base call
        if (str.length() == 0) {
            System.out.println(ans);
            return;
        }
        // kaam and fn call
        for (int i = 0; i < str.length(); i++) {
            String newstr = str.substring(0, i) + str.substring(i + 1, str.length());
            getPermutation(newstr, ans + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        getPermutation("abc", "");
    }
}
