package pl.it.camp.dziedziczenie.model;

public class Szesciobok extends Wielobok{
    int[] boki = new int[6];
    public Szesciobok(WprowadzoneBoki wprowadzone) {
        for (int i = 0; i < 6; i++) {
            boki[i] = wprowadzone.getBoki()[i];
            if (boki[0] == boki[1] && boki[1] == boki[2] && boki[2] == boki[3] &&
                    boki[3] == boki[4] && boki[4] == boki[5]) {
                typ = "szesciokat foremny";
            }
            else {
                typ = "szesciokat";
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
        if (typ == "szesciokat foremny") {
            pole = ((boki[1]* boki[1]) * 2.598);
        }
        return pole;
    }

    @Override
    double obwod() {
        return boki[0] + boki[1] + boki[2] + boki[3] + boki[4] + boki[5];
    }
}
