package Queue;

import java.util.*;;

public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabccxb";
        Queue<Character> q = new LinkedList<>();
        StringBuilder ans = new StringBuilder("");
        int freq[] = new int[26]; // for smallcase only
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i) - 97]++;
            q.add(str.charAt(i));
            while (!q.isEmpty() && freq[q.peek() - 97] > 1) {
                q.remove();
            }
            if (q.isEmpty()) {
                ans.append("-1");
                continue;
            }
            ans.append(q.peek());
        }
        System.out.println(ans);
    }
}
