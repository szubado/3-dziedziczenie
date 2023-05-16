package pl.it.camp.dziedziczenie.model;

public abstract class Wielobok {

    String typ;

    public boolean sprawdzSens() {
        int[] boki = getBoki();
        for (int i = 0; i < boki.length; i++) {
            int suma = 0;
            //zsumuj pozostale boki bez i
            for ( int j = 0; j < boki.length; j++) {
                if (i != j) {
                    // suma = suma + bokow pozostalych
                    suma += boki[j];
                }
            }
            //porownaj pierwszy bok z suma pozostalych
            if (boki[i] >= suma) {
                System.out.println("Nie jestesmy w stanie utworzyc figury" + boki[i] + " " + suma);
                return false;
            }
        }
        return true;
    }
    abstract int[] getBoki();
    abstract String getTyp();


    abstract double pole();
    abstract double obwod();

    public void wypisz() {
        System.out.println(typ);
        System.out.println("pole: " + pole());
        System.out.println("obwod: " + obwod());
    }
}
