public class Tamagochi {
   // String = nameTamago;
    int x = 6;
    int y = 4;


    int futterStand = 5;




    //int steps;




    public void move(String r) {
        if(futterStand < 1)
            return;
        switch(r) {
            case "oben" : y++;
            case "unten": y--;
            case "links": x--;
            case "rechts": x++;
        }

    }












}
