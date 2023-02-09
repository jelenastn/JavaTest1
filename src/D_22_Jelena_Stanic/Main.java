package D_22_Jelena_Stanic;

public class Main {
    //Zadatak 1.
    //Napraviti klasu Radnik koja ima atribute id, naziv radnika,
    // godine iskustva i plata. Klase Fizikalac, SefSmene i Investitor
    // nasledjuju klasu Radnik. Investitor ce imati dodatno polje
    // za broj zgrada koje je do sada digao. Istampati njihove podatke
    // sa tim da racunamo 20% vecu platu sefu smene i fizikalcu ako
    // imaju vise od 5 godina iskustva i 30% vecu platu investitoru ako je digao bar 5 zgrada.
    public static void main(String[] args) {
        Fizikalac f1 = new Fizikalac(1, "Djordje Peric", 4, 100000);
        Fizikalac f2 = new Fizikalac(1, "Marko Peric", 6, 100000);
        Investitor i1 = new Investitor(11, "IgorBuild", 4,150000,2);
        Investitor i2 = new Investitor(12, "PeraGradnja", 4,150000,6);
        SefSmene s1 = new SefSmene(101,"Matija Gradic", 4,200000);
        SefSmene s2 = new SefSmene(102,"Miki Peric", 6,200000);
        f1.stampa();
        f2.stampa();
        i1.stampa();
        i2.stampa();
        s1.stampa();
        s2.stampa();
    }
}
