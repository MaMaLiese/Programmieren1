public class Auto {
    private String marke;
    private String typ;
    private int ps;
}

    //KOnstruktor von Auto mit allen möglichen Variablen; Konstruktor verlangt bestimmte variable, wenn nix drin dann NULL
    public Auto(String marke, String typ, int ps){
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;
    }

    public Auto(String marke, String typ){
        this.marke = marke;
        this.typ = typ;
        this.ps = 150;
    }
//Falls Auto ohne jegliche Angaben übermittelt wird!
    public Auto(){
        this.marke = "Dummy-Auto";
        this.typ = "Dummy-Typ";
        this.ps = 0;
    }


    //shortcut alt+eingabe für getter-setter
    public String getMarke() { //bei get keine Parameter, weil nix übergeben wird
        return marke; //muss weil oben nicht void steht
    }
    public void setMarke(String marke) { //das was in Klammer kommt speichern wir in this.marke; set braucht parameter
        this.marke = marke;
    }

    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;

    }

    public int getPs() {
        return ps;
    }


    public void setPs(int ps) {  //void, weil ich nichts zurückgebe
        this.ps = ps;
    }


}
