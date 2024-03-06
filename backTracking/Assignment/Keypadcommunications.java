package backTracking.Assignment;

import java.util.ArrayList;
import java.util.List;

public class Keypadcommunications {
    static List<String> strLst = new ArrayList<>();

    public static void getallCombinations(String[] str, String digits, String ans, int i) {
        // base case
        if (i == digits.length()) {
            if (ans != "") {
                strLst.add(ans);
            }
            return;
        }
        // work and fn call

        char getNumChar = digits.charAt(i);
        int getNum = getNumChar - '0';
        System.out.println(getNum);
        String mappedAlphaValue = str[getNum];
        for (int j = 0; j < mappedAlphaValue.length(); j++) {
            getallCombinations(str, digits, ans + mappedAlphaValue.charAt(j), i + 1);
        }

    }

    public static List<String> letterCombinations(String digits) {
        String[] str = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        getallCombinations(str, digits, "", 0);
        return strLst;
    }

    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }
}
