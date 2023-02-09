package D_24_Jelena_Stanic;

import java.util.ArrayList;

public class Korpa {
    //Zatim napraviti klasu Korpa. Unutar korpe imamo listu namirnica.
    //    Osim konstuktora definisati:
    //            - metoda int suma(ArrayList<Namirnica> lista) - vraca ukupnu cenu svih namirnica iz korpe.
    //- metoda boolean nalaziSe(Namirnica n) - vraca true ukoliko se neka namirnica nalazi u korpi.
    //- metoda stampaj() - istampace sve namirnice iz liste.
    ArrayList<Namirnica> listaNamirnica;

    public Korpa() {
        this.listaNamirnica = new ArrayList<Namirnica>();
    }

    //this.listaNamirnica = new ArrayList<>();

    public int suma() {
        int suma = 0;

        for (int i = 0; i < this.listaNamirnica.size(); i++) {
            suma = suma + this.listaNamirnica.get(i).getCena();
        }
        return suma;
    }

    public void stampa() {
        System.out.println("U korpi su sledece namirnice:");
        for (int i = 0; i < listaNamirnica.size(); i++) {
            System.out.println("Naziv: "+listaNamirnica.get(i).getNaziv() + ", Cena: " + listaNamirnica.get(i).getCena());
        }
    }

    public boolean nalaziSe(String n) {
        boolean naspisku = false;
        for (int i = 0; i < listaNamirnica.size(); i++) {
            if (listaNamirnica.get(i).getNaziv().equalsIgnoreCase(n)) {
                naspisku = true;
                break;
            }
        }
        return naspisku;
    }
}