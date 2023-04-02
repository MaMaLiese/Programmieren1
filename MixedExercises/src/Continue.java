public class Continue {
    //continue und break sind keywords; continue spring wieder nach oben
    //while (blabla true ){
    // sldfkjgjfj ---- continure;
    public static void main(String[] args) {
        boolean isHaus = true;
// wir möchten die möglich zugänglichen STockwerke als Gast sehen
        for(int i=1; i <= 68; i++) {
            if (i == 10 || i == 19 || i == 28 || i == 36 || i == 55) {
                continue;
            }

            System.out.println("Etage " + i);

            //Falls es sich um einen Lift in einem Haus handelt, dann nur max. 4 STockwerke ausgeben!
            if(isHaus && i==4){ // wenn ich oben boolean auf standarmäßig false habe macht er die Hotelstockwerke
                break;
            }
        }

    }
}

