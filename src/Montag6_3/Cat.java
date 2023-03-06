package Montag6_3;

public class Cat {
    boolean hasFur;
    boolean hasTail;
    String colour;
    int numberOfLegs;



    //contructor generieren:



    public Cat(boolean hasFur, boolean hasTail, String colour, int numberOfLegs) {
        this.hasFur = hasFur;
        this.hasTail = hasTail;
        this.colour = colour;
        this.numberOfLegs = numberOfLegs;
    }
    public String speak(){
        return "Miau";
    }
}
