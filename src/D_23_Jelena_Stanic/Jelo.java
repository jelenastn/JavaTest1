package D_23_Jelena_Stanic;

import java.util.ArrayList;

public class Jelo {
    //Zadatak 2.
    //Napraviti klasu Jelo, koje ce imati atribute za naziv, listu sastojaka
    // i boolean vrednost bezLaktoze. Klase Corba, Torta i Sarma nasledjuju klasu Jelo.
    // Ukoliko je jedan od sastojaka mleko, podesicemo boolean vrednost za laktozu na false,
    // u suprotnom na true. U main klasi kreirati i istampati bar tri jela (njihov naziv, sastojke i da li lactose-free).
    String naziv;
    ArrayList<String> listaSastojaka;
    boolean bezLaktoze;

    public Jelo(String naziv, boolean bezLaktoze) {
        this.naziv = naziv;
        this.listaSastojaka = new ArrayList<>();
        this.bezLaktoze = bezLaktoze;
    }
    public boolean BezLaktoze(){
        bezLaktoze = true;
        for(int i =0; i< listaSastojaka.size();i++){
            if (listaSastojaka.get(i).equalsIgnoreCase("mleko")){
                bezLaktoze = false;
                break;
            }

        }
        return bezLaktoze;
    }
    public void stampa(){
        System.out.print("Jelo "+this.naziv);
        if (bezLaktoze){
            System.out.println(" ne sadrzi laktozu.");
        } else {
            System.out.println(" sadrzi laktozu!!!");
        }
    }



    }

