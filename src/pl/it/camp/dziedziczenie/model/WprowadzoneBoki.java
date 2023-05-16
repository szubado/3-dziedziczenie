package pl.it.camp.dziedziczenie.model;

public class WprowadzoneBoki {

    private int[] boki = new int[6];
    private int liczbaBokow;

    public WprowadzoneBoki() {
    }

    public int[] getBoki() {
        return boki;
    }

    public void setBok(int ktory, int bok) {
        this.boki[ktory] = bok;
    }

    public int getLiczbaBokow() {
        return liczbaBokow;
    }

    public void setLiczbaBokow(int liczbaBokow) {
        this.liczbaBokow = liczbaBokow;
    }


    public void wypisz() {
        System.out.print(liczbaBokow + "-");
        for (int i = 0; i < liczbaBokow; i++) {
            System.out.print(boki[i] + " ");
        }
        System.out.println();
    }
}
