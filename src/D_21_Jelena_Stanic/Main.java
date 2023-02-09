package D_21_Jelena_Stanic;

public class Main {
    public static void main(String[] args) {
      //  Zadatak 2.
      //  Napraviti klasu Radnik koja ima ime, poziciju i platu.
        //  U glavnoj klasi napraviti dva radnika, proveriti cija
        //  je plata veca, istampati informacije radnika cija je plata veca, uz 20% vecu platu.
        Radnik radnik1 = new Radnik("Matija", "programer", 180000);
        Radnik radnik2 = new Radnik("Iva", "veterinar", 150000);
        Radnik rezultat = provera(radnik1, radnik2);
        System.out.println("Podaci o radniku sa većom platom");
        rezultat.printRadnik();
    }
    public static Radnik provera (Radnik y, Radnik x){
        if (x.getPlata()>y.getPlata()){
            x.setPlata(x.getPlata()*1.2);
            return x;
        } else {
            y.setPlata(y.getPlata()*1.2);
            return y;
        }

    }
    

}
