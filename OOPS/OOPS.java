package OOPS;

public class OOPS {
    public static void main(String[] args) {
        // making object using class Pen
        Pen p1 = new Pen();
        p1.setColor("blue");
        System.out.println(p1.color);
        p1.setTip(6);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);

        // making object using class BankAccount
        BankAccount bankAcc = new BankAccount();
        bankAcc.Username = "Abhay";
        // System.out.println(bankAcc.Password); //The field BankAccount.Password is not
        // visible
        bankAcc.setPassword("abdiuidu");
    }
}

class Pen {
    String color;
    int tip;

    void setColor(String newColor) {
        color = newColor;
    }

    void setTip(int newTip) {
        tip = newTip;
    }
}

class BankAccount {
    public String Username;
    private String Password;

    void setPassword(String password) { // only inside the class private property or methods are visible
        Password = password;
        System.out.println(Password);
    }
}