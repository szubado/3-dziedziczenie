package pl.it.camp.dziedziczenie.model;

public class Pieciobok extends Wielobok{
    int[] boki = new int[5];
    public Pieciobok(WprowadzoneBoki wprowadzone) {
        for (int i = 0; i < 5; i++) {
            boki[i] = wprowadzone.getBoki()[i];
            if (boki[0] == boki[1] && boki[1] == boki[2] && boki[2] == boki[3] && boki[3] == boki[4]) {
                typ = "pieciokat foremny";
            }
            else {
                typ = "pieciokat";
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
        if (typ == "pieciokat foremny") {
            pole = ((boki[1]* boki[1]) * 1.72048);
        }
        return pole;
    }

    @Override
    double obwod() {
        return boki[0] + boki[1] + boki[2] + boki[3] + boki[4];
    }
}
