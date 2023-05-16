package pl.it.camp.dziedziczenie.gui;

import pl.it.camp.dziedziczenie.model.WprowadzoneBoki;

import java.util.Scanner;

public class GUI {
    static Scanner scanner = new Scanner(System.in);


    public WprowadzoneBoki[] wprowadzBoki(int size) {
        WprowadzoneBoki[] wprowadzoneBoki = new WprowadzoneBoki[size];
        int count = 0;
        System.out.println("Wprowadz 5 zestawow liczb:");
        while (count < size) {          //zmienione 5 na size
            System.out.println("Podaj zestaw:");
            //wprowadz linie z klawiatury
            String linia = scanner.nextLine();
            //do 7miu bo 7mym bedzie cala reszta smieci
            String[] boki = linia.split(" ", 7);
            //w boki powyzej mamy stringi z bokami
            wprowadzoneBoki[count] = new WprowadzoneBoki();
         //inicjowanie
            int liczbaBokow = (boki.length < 7) ? boki.length : 6;
            //wpisz do wprowadzoneBoki aktualna liczbe boków (ile stringow jest w danej linii)
            wprowadzoneBoki[count].setLiczbaBokow(liczbaBokow);
            //przepisz te boki
            for (int j = 0; j < liczbaBokow; j++) {
                //ponizej j wskazuje ktora pozycja w tabeli jest dany bok, jesli 8ka jest 3cim bokiem to wprowadzi nam w tabele 8ke pod 3 index
                wprowadzoneBoki[count].setBok(j, Integer.parseInt(boki[j]));
            }
            count++;
        }
        return wprowadzoneBoki;
    }
}


