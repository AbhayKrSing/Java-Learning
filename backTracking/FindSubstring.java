package backTracking;

public class FindSubstring {
    public static void printArray(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void getSubset(String str, String ans, int i) {
        // base case
        if (i == str.length()) {
            if (ans.length() == 0) { // for visibility
                System.out.println("null");
                return;
            }
            System.out.println(ans);
            return;
        }

        // kaam and fn call
        getSubset(str, ans, i + 1); // for No
        // ans +=str.charAt(i);
        getSubset(str, ans + str.charAt(i), i + 1); // for Yes
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";
        getSubset(str, ans, 0);

    }
}
