package Testing;

public class Testing {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void getsubstring(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
                return;
            }
            System.out.println(ans);
            return;
        }

        // kaam and fn call
        getsubstring(str, ans, i + 1);
        // ans +=str.charAt(i);
        getsubstring(str, ans + str.charAt(i), i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        getsubstring(str, ans, 0);

    }
}