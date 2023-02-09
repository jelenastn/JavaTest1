package D_24_Jelena_Stanic;

import java.util.ArrayList;

public class Namirnica {

 /*   Napraviti klasu Namirnica. Ona ima atribute za naziv i cenu. Dodati konstuktor i get metode za ovu klasu.
    Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
    Osim konstuktora definisati:
            - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
- metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
- metoda stampaj() - istampace sve namirnice iz liste.
    U glavnoj klasi napraviti listu namirnica koju cete proslediti konstruktoru klase Korpa.*/
    String naziv;
    int cena;

    public Namirnica(String naziv, int cena) {
        this.naziv = naziv;
        this.cena = cena;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getCena() {
        return cena;
    }


}
