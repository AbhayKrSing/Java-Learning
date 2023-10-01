package OOPS;

public class OOPS_2 {
    public static void main(String[] args) {
        Pens p1 = new Pens();
        p1.setColor("Yellow");
        System.out.println(p1.getColor());
        System.out.println(p1.getTip());

        Pens p2 = new Pens();
        System.out.println(p2.getColor());
        p2.setTip(100);
        System.out.println(p2.getTip());

    }
}

class Pens {
    private String color;
    private int tip;

    void setColor(String newColor) { // this is setter(use to set value)
        // color = newColor;
        this.color = newColor;
    }

    void setTip(int tip) { // this is setter(use to set value)
        this.tip = tip;
        // tip=newtip;
    }

    String getColor() { // this is getter(use to get values)
        return color;
    }

    int getTip() { // this is getter(use to get values)
        return this.tip;
    }
}