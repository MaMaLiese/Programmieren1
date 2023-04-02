public class Rechteck {
   private double rlaenge;  //weil wir nicht wollen, dass variable in Main geändert wird
   private double rbreite;




   //Konstruktor:

    Rechteck(double l, double b) {
        rlaenge = l;
        rbreite = b;

    }
    public double getRlaenge() {
        return rbreite;
    }
    public double getRbreite(){
        return rlaenge;
    }

            public double getArea(){
        double area = rlaenge * rbreite;
        return area;



    }
}
