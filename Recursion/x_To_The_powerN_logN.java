package Recursion;

public class x_To_The_powerN_logN {
    public static int getpower(int x, int n) {
        // if (n == 1) {
        // return x;
        // }
        if (n == 0) {
            return 1;
        }
        // int halfpower = getpower(x, n / 2) * getpower(x, n / 2); //due to calling of
        // same function two times its time complexity remains O(n).To remove that store
        // getpower(x,n/2) into a variable and square it.Like shown below
        int halfpower = getpower(x, n / 2); // Now its time complexity is O(n)
        int halfpowersq = halfpower * halfpower;
        if (n % 2 == 0) {
            return halfpowersq;
        } else {
            return x * halfpowersq;
        }
    }

    public static void main(String[] args) {
        System.out.println(getpower(2, 6));
    }

}