package D_21_Jelena_Stanic;

public class Radnik {
    //Zadatak 2.
    //Napraviti klasu Radnik koja ima ime, poziciju i platu.
    // U glavnoj klasi napraviti dva radnika, proveriti
    // cija je plata veca, istampati informacije radnika
    // cija je plata veca, uz 20% vecu platu.
    String ime;
    String pozicija;
    double plata;

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPozicija() {
        return pozicija;
    }

    public void setPozicija(String pozicija) {
        this.pozicija = pozicija;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public void printRadnik() {
        System.out.println("Ime: "+ime);
        System.out.println("Pozicija: "+pozicija);
        System.out.println("Plata: "+plata);
    }

    public Radnik(String ime, String pozicija, double plata){
        this.ime = ime;
        this.pozicija = pozicija;
        this.plata = plata;




    }

}
