package pl.it.camp.dziedziczenie.model;

public class Czworobok extends Wielobok{
    int[] boki = new int[4];
    public Czworobok(WprowadzoneBoki wprowadzone) {
        for (int i = 0; i < 4; i++) {
            boki[i] = wprowadzone.getBoki()[i];
            if (boki[0] == boki[1] && boki[2] == boki[3] && boki[2] == boki[1]) {
                typ = "kwadrat";
            }
            else if ((boki[0] == boki[1] && boki[2] == boki[3]) ||
                    (boki[0] == boki[2] && boki[1] == boki[3]) ||
                    (boki[0] == boki[3] && boki[2] == boki[1])) {
                typ = "prostokat";
            }
            else {
                typ = "czworobok";
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
        double pole = 0;
        if (typ == "kwadrat") {
            pole = boki[0] * boki[1];
        }
        else if (typ == "prostokat") {
            if (boki[0] != boki[1]) {
                pole = boki[0] * boki[1];
            }
            else {
                pole = boki[0] * boki[2];
            }
        }
        return pole;
    }

    @Override
    double obwod() {
        return boki[0] + boki[1] + boki[2] + boki[3];
    }
}
