package Recursion;

public class FriendsPairing {
    public static int pairingways(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 2;
        }
        return pairingways(n - 1) + (n - 1) * pairingways(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(pairingways(4));
    }
}
