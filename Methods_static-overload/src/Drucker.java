public class Drucker {
    private String zeichenkette;
    private int ganzeZahl;
    private double kommaZahl;
    private boolean print;

    public void drucken(String zeichenkette) {
        this.zeichenkette = zeichenkette;
    }
    public void drucken(int ganzeZahl) {
        this.ganzeZahl = ganzeZahl;
    }

    public void drucken(double kommaZahl) {
        this.kommaZahl = kommaZahl;
    }
    public void drucken(boolean print){
        return;
    }
    public static void main(String[] args) {}

}
