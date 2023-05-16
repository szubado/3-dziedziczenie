package pl.it.camp.dziedziczenie;

import pl.it.camp.dziedziczenie.gui.GUI;
import pl.it.camp.dziedziczenie.model.*;

public class App {
    public static void main(String[] args) {
        GUI gui = new GUI();
        WprowadzoneBoki[] wprowadzoneBoki = gui.wprowadzBoki(3);
        for (int i = 0; i < wprowadzoneBoki.length; i++) {
            wprowadzoneBoki[i].wypisz();
        }
        for (int i = 0; i < wprowadzoneBoki.length; i++) {
            switch(wprowadzoneBoki[i].getLiczbaBokow()) {
                case 3:
                    Trojkat trojkat = new Trojkat(wprowadzoneBoki[i]);
                    if (trojkat.sprawdzSens()) {
                        trojkat.wypisz();
                    }
                    break;
                case 4:
                    Czworobok czworobok = new Czworobok(wprowadzoneBoki[i]);
                    if (czworobok.sprawdzSens()) {
                        czworobok.wypisz();
                    }
                    break;
                case 5:
                    Pieciobok pieciobok = new Pieciobok(wprowadzoneBoki[i]);
                    if (pieciobok.sprawdzSens()) {
                        pieciobok.wypisz();
                    }
                    break;
                case 6:
                    Szesciobok szesciobok = new Szesciobok(wprowadzoneBoki[i]);
                    if (szesciobok.sprawdzSens()) {
                        szesciobok.wypisz();
                    }
                    break;
                default:
                    System.out.println("Na razie nie obsulgujemy");
            }
        }
    }
}
