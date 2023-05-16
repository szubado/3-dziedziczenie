package pl.it.camp.dziedziczenie.model;

import static java.lang.Math.sqrt;

public class Trojkat extends Wielobok {
    int[] boki = new int[3];
    public Trojkat(WprowadzoneBoki wprowadzone) {
        for (int i = 0; i < 3; i++) {
            boki[i] = wprowadzone.getBoki()[i];
            if (boki[0] == boki[1] && boki[0] == boki[2]) {
                typ = "trojkat rownoboczny";
            }
            else if (boki[0] == boki[1] || boki[0] == boki[2] || boki[2] == boki[1]) {
                typ = "trojkat rownoramienny";
            }
            else {
                typ = "trojkat roznoboczny";
            }
        }
    }

    @Override
    int[] getBoki() {
        return boki;
    }

    @Override
    String getTyp() {
        return typ;
    }

    @Override
    double pole() {
        double polPola = (boki[0] + boki[1] + boki[2]) / 2.0;
        return sqrt(polPola * (polPola - boki[0]) * (polPola - boki[1]) * (polPola - boki[2]));
    }

    @Override
    double obwod() {
        return boki[0] + boki[1] + boki[2];
    }
}
