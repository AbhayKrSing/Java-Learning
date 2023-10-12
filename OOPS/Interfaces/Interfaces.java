package Interfaces;

public class Interfaces {
    public static void main(String[] args) {
        Rook r = new Rook();
        r.moves();
    }
}

interface ChessPlayer { // total abstraction
    void moves(); // implementation is hidden
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Move anywhere with any steps");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Moves one step in any four direction");
    }
}

class Elephant implements ChessPlayer {
    public void moves() {
        System.out.println("Moves any number of steps in any all four direction");
    }
}

class Horse implements ChessPlayer {
    public void moves() {
        System.out.println("Moves 1 1/2 steps");
    }
}
