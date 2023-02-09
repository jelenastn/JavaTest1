package D_22_Jelena_Stanic;

public class Fizikalac extends Radnik{
    //20% vecu platu sefu smene i fizikalcu ako imaju vise od 5 godina iskustva
    public Fizikalac(int ID, String naziv, int godineIskustva, double plata) {
        super(ID, naziv, godineIskustva, plata);
    }
    public void stampa(){
        System.out.print("Ime radnika je "+this.naziv+", ID broj - "+this.ID+", a godine iskustva - "+this.godineIskustva+" i dobija platu od: " );
        if (godineIskustva<5){
            System.out.println(this.plata+" dinara.");
        } else {
            System.out.println(this.plata*1.2+" dinara.");
        }
    }
}
